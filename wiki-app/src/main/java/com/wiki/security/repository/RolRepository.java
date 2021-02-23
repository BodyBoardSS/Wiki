/**
 * 
 */
package com.wiki.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiki.security.entity.Rol;
import com.wiki.security.enums.RolName;

/**
 * @author kevin_orellana
 *
 */

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
	
	/**
	 * @param rolName
	 * @return RolName
	 */
	public Optional<Rol> findeByRolName(RolName rolName);

}
