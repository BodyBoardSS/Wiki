/**
 * 
 */
package com.wiki.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wiki.security.entity.User;
import com.wiki.security.repository.UserRepository;

/**
 * @author kevin_orellana
 *
 */

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	/**
	 * @param userName
	 * @return User
	 */
	public Optional<User> getByUserName(String userName){
		return userRepository.findByUserName(userName);
	}
	
	/**
	 * @param userName
	 * @return Boolean
	 */
	public Boolean existsByUserName(String userName) {
		return userRepository.existsByUserName(userName);
	}
	
	/**
	 * @param email
	 * @return Boolean
	 */
	public Boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}
	
	/**
	 * @param user
	 */
	public void save(User user) {
		userRepository.save(user);
	}
}
