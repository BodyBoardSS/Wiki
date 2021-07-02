package com.wiki.service;

import com.wiki.entity.MethodPayment;
import com.wiki.repository.MethodPaymentRepository;
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
public class MethodPaymentService {
    @Autowired
    MethodPaymentRepository methodPaymentRepository;

    public List<MethodPayment> findAll() {
        return methodPaymentRepository.findAll();
    }

    public MethodPayment getOne(Integer integer) {
        return methodPaymentRepository.getOne(integer);
    }

    public <S extends MethodPayment> S save(S s) {
        return methodPaymentRepository.save(s);
    }

    public Optional<MethodPayment> findById(Integer integer) {
        return methodPaymentRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return methodPaymentRepository.existsById(integer);
    }
}
