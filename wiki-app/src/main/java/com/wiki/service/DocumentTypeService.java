package com.wiki.service;

import com.wiki.entity.DocumentType;
import com.wiki.repository.DocumentTypeRepository;
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
public class DocumentTypeService {
    @Autowired
    DocumentTypeRepository documentTypeRepository;

    public List<DocumentType> findAll() {
        return documentTypeRepository.findAll();
    }

    public <S extends DocumentType> S save(S s) {
        return documentTypeRepository.save(s);
    }

    public Optional<DocumentType> findById(Integer integer) {
        return documentTypeRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return documentTypeRepository.existsById(integer);
    }
}
