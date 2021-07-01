/**
 * 
 */
package com.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiki.entity.CustomerCel;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface PhoneRepository extends JpaRepository<CustomerCel, Integer>{

}
