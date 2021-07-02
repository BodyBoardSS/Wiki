package com.wiki.service;

import com.wiki.entity.Invoice;
import com.wiki.repository.InvoiceRepository;
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
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice getOne(Integer integer) {
        return invoiceRepository.getOne(integer);
    }

    public <S extends Invoice> S save(S s) {
        return invoiceRepository.save(s);
    }

    public Optional<Invoice> findById(Integer integer) {
        return invoiceRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return invoiceRepository.existsById(integer);
    }
}
