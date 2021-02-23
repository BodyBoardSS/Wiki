/**
 * 
 */
package com.wiki.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiki.security.entity.User;

/**
 * @author kevin_orellana
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	/**
	 * @param userName
	 * @return User
	 */
	Optional<User> findByUserName(String userName);
	
	/**
	 * @param userName
	 * @return Boolean
	 */
	Boolean existsByUserName(String userName);
	
	/**
	 * @param userName
	 * @return Boolean
	 */
	Boolean existsByEmail(String userName);
}
