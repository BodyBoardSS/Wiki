package com.wiki.service;

import com.wiki.entity.Product;
import com.wiki.repository.ProductRepository;
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
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product getOne(Integer integer) {
        return productRepository.getOne(integer);
    }

    public <S extends Product> S save(S s) {
        return productRepository.save(s);
    }

    public Optional<Product> findById(Integer integer) {
        return productRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return productRepository.existsById(integer);
    }
}
