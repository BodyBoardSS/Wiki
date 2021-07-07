package com.wiki.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wiki.entity.Supplier;
import com.wiki.repository.SupplierRepository;

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

    public Optional<Supplier> getOne(int id) {
        return supplierRepository.findById(id);
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
