/**
 * 
 */
package com.wiki.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wiki.security.entity.Rol;
import com.wiki.security.enums.RolName;
import com.wiki.security.repository.RolRepository;

/**
 * @author kevin_orellana
 *
 */

@Service
@Transactional
public class RolService {
	
	@Autowired
	RolRepository rolRepository;
	
	/**
	 * @param rolName
	 * @return RolName
	 */
	public Optional<Rol> getByRolName(RolName rolName){
		return rolRepository.findeByRolName(rolName);
	}
}
