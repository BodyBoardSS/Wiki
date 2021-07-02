package com.wiki.repository;

import com.wiki.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
