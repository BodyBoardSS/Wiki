/**
 *
 */
package com.wiki.service;

import com.wiki.entity.Customer;
import com.wiki.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */

@Service
@Transactional
public class CustomerService {

    @Autowired
    CustomerRepository cutomerRepository;

    /**
     * @param <S>
     * @param entity
     * @return
     * @see org.springframework.data.repository.CrudRepository#save(java.lang.Object)
     */
    public <S extends Customer> S save(S entity) {
        return cutomerRepository.save(entity);
    }

    /**
     * @return
     * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
     */
    public List<Customer> findAll() {
        return cutomerRepository.findAll();
    }

    /**
     * @param id
     * @return
     * @see org.springframework.data.repository.CrudRepository#findById(java.lang.Object)
     */
    public Optional<Customer> findById(Integer id) {
        return cutomerRepository.findById(id);
    }

    /**
     * @param id
     * @return
     * @see org.springframework.data.repository.CrudRepository#existsById(java.lang.Object)
     */
    public boolean existsById(Integer id) {
        return cutomerRepository.existsById(id);
    }

    /**
     * @param id
     * @return
     * @see org.springframework.data.jpa.repository.JpaRepository#getOne(java.lang.Object)
     */
    public Optional<Customer> getOne(int id) {
        return cutomerRepository.findById(id);
    }

    /**
     * @param id
     * @see org.springframework.data.repository.CrudRepository#deleteById(java.lang.Object)
     */
    public void delete(Integer id) {
        cutomerRepository.deleteById(id);
    }


}
