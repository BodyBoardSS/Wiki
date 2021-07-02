package com.wiki.service;

import com.wiki.entity.InvoiceDetail;
import com.wiki.repository.InvoiceDetailRepository;
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
public class InvoiceDeatilService {
    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;

    public List<InvoiceDetail> findAll() {
        return invoiceDetailRepository.findAll();
    }

    public InvoiceDetail getOne(Integer integer) {
        return invoiceDetailRepository.getOne(integer);
    }

    public <S extends InvoiceDetail> S save(S s) {
        return invoiceDetailRepository.save(s);
    }

    public Optional<InvoiceDetail> findById(Integer integer) {
        return invoiceDetailRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return invoiceDetailRepository.existsById(integer);
    }
}
