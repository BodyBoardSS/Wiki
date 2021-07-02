package com.wiki.service;

import com.wiki.entity.CustomerType;
import com.wiki.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author kevin_orellana
 */
@Service
@Transactional
public class CustomerTypeService {
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }

    public CustomerType getOne(Integer integer) {
        return customerTypeRepository.getOne(integer);
    }

    public <S extends CustomerType> S save(S s) {
        return customerTypeRepository.save(s);
    }

    public Optional<CustomerType> findById(Integer integer) {
        return customerTypeRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return customerTypeRepository.existsById(integer);
    }
}
