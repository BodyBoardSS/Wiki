package com.wiki.service;

import com.wiki.entity.ProductType;
import com.wiki.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author kevin_orellana
 */
@Service
@Transactional
public class ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;

    public List<ProductType> findAll() {
        return productTypeRepository.findAll();
    }

    public ProductType getOne(Integer integer) {
        return productTypeRepository.getOne(integer);
    }

    public <S extends ProductType> S save(S s) {
        return productTypeRepository.save(s);
    }

    public Optional<ProductType> findById(Integer integer) {
        return productTypeRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return productTypeRepository.existsById(integer);
    }

    public <S extends ProductType> Optional<S> findOne(Example<S> example) {
        return productTypeRepository.findOne(example);
    }
}
