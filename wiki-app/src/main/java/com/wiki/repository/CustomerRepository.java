package com.wiki.repository;

import com.wiki.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
