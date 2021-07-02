package com.wiki.service;

import com.wiki.entity.Address;
import com.wiki.repository.AddressRepository;
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
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address getOne(Integer integer) {
        return addressRepository.getOne(integer);
    }

    public <S extends Address> S save(S s) {
        return addressRepository.save(s);
    }

    public Optional<Address> findById(Integer integer) {
        return addressRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return addressRepository.existsById(integer);
    }
}
