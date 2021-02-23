/**
 * 
 */
package com.wiki.security.controller;

import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiki.dto.Mensaje;
import com.wiki.security.dto.JwtDto;
import com.wiki.security.dto.LoginUser;
import com.wiki.security.dto.NewUser;
import com.wiki.security.entity.Rol;
import com.wiki.security.entity.User;
import com.wiki.security.enums.RolName;
import com.wiki.security.jwt.JwtProvider;
import com.wiki.security.service.RolService;
import com.wiki.security.service.UserService;

/**
 * @author kevin_orellana
 *
 */

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserService userService;
	
	@Autowired
	RolService rolService;
	
	@Autowired
	JwtProvider jwtProvider;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/nuevo")
	public ResponseEntity<?> nuevo (@Valid @RequestBody NewUser newUser, BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return new ResponseEntity(new Mensaje("Campos mal puestos o email invalido"), HttpStatus.BAD_REQUEST);
		
		if(userService.existsByUserName(newUser.getUserName()))
			return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
		
		if(userService.existsByEmail(newUser.getEmail()))
			return new ResponseEntity(new Mensaje("Ese email ya existe"), HttpStatus.BAD_REQUEST);
		User user = new User(newUser.getName(),newUser.getUserName(),newUser.getEmail(),passwordEncoder.encode(newUser.getPassword()));
		
		Set<Rol> roles = new HashSet<>();
		
		roles.add(rolService.getByRolName(RolName.ROLE_USER).get());
		
		if(newUser.getRoles().contains("admin"))
			roles.add(rolService.getByRolName(RolName.ROLE_ADMIN).get());
		user.setRoles(roles);
		userService.save(user);
		return new ResponseEntity(new Mensaje("Usuario creado"),HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PostMapping("/login")
	public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult){
		if(bindingResult.hasErrors())
			return new ResponseEntity(new Mensaje("Campos mal puestos "), HttpStatus.BAD_REQUEST);
		
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		String jwt = jwtProvider.generateToken(authentication);
		
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		
		JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
		
		return new ResponseEntity<JwtDto>(jwtDto,HttpStatus.OK);
	}
}
