package com.wiki.repository;

import com.wiki.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface ProductTypeRepository extends JpaRepository<ProductType, Integer> {

}
