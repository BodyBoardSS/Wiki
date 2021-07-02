package com.wiki.security.service;

import com.wiki.security.entity.User;
import com.wiki.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<User> getByUserName(String userName){
        return usuarioRepository.findByUserName(userName);
    }

    public boolean existsByUserName(String userName){
        return usuarioRepository.existsByUserName(userName);
    }

    public boolean existsByEmail(String email){
        return usuarioRepository.existsByEmail(email);
    }

    public void save(User user){
        usuarioRepository.save(user);
    }
}
