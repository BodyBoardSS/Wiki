/**
 * 
 */
package com.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiki.entity.CustomerAdd;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface AddressRepository extends JpaRepository<CustomerAdd, Integer>{

}
