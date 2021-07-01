/**
 * 
 */
package com.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiki.entity.Product;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
