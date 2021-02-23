/**
 * 
 */
package com.wiki.security.entity;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author kevin_orellana
 *
 */
public class PrimaryUser implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String userName;
	private String email;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	/**
	 * @param name
	 * @param userName
	 * @param email
	 * @param password
	 * @param authorities
	 */
	public PrimaryUser(String name, String userName, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}
	
	public static PrimaryUser build(User user) {
		List<GrantedAuthority> authorities = user.getRoles().stream().map(rol-> new SimpleGrantedAuthority(rol.getRolName().name())).collect(Collectors.toList());
		
		return new PrimaryUser(user.getName(), user.getUserName(), user.getEmail(), user.getPassword(), authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
