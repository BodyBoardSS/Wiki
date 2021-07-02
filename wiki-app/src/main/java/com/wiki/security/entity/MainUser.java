package com.wiki.security.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MainUser implements UserDetails {
    private String Name;
    private String NameUser;
    private String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public MainUser(String Name, String NameUser, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.Name = Name;
        this.NameUser = NameUser;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static MainUser build(User User){
        List<GrantedAuthority> authorities =
                User.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol
                .getRolName().name())).collect(Collectors.toList());
        return new MainUser(User.getName(), User.getUserName(), User.getEmail(), User.getPassword(), authorities);
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
        return NameUser;
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
        return Name;
    }

    public String getEmail() {
        return email;
    }
}
