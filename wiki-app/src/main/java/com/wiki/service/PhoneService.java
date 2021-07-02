package com.wiki.service;

import com.wiki.entity.Phone;
import com.wiki.repository.PhoneRepository;
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
public class PhoneService {
    @Autowired
    PhoneRepository phoneRepository;

    public List<Phone> findAll() {
        return phoneRepository.findAll();
    }

    public Phone getOne(Integer integer) {
        return phoneRepository.getOne(integer);
    }

    public <S extends Phone> S save(S s) {
        return phoneRepository.save(s);
    }

    public Optional<Phone> findById(Integer integer) {
        return phoneRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return phoneRepository.existsById(integer);
    }
}
