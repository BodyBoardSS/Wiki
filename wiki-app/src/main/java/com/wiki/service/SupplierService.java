package com.wiki.service;

import com.wiki.entity.Supplier;
import com.wiki.repository.SupplierRepository;
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
public class SupplierService {
    @Autowired
    SupplierRepository supplierRepository;

    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public Supplier getOne(Integer integer) {
        return supplierRepository.getOne(integer);
    }

    public <S extends Supplier> S save(S s) {
        return supplierRepository.save(s);
    }

    public Optional<Supplier> findById(Integer integer) {
        return supplierRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return supplierRepository.existsById(integer);
    }

    public <S extends Supplier> Optional<S> findOne(Example<S> example) {
        return supplierRepository.findOne(example);
    }
}
