package com.wiki.repository;

import com.wiki.entity.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface CustomerTypeRepository extends JpaRepository<CustomerType, Integer> {

}
