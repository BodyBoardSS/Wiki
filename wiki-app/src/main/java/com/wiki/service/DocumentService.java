package com.wiki.service;

import com.wiki.entity.Document;
import com.wiki.repository.DocumentRepository;
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
public class DocumentService {
    @Autowired
    DocumentRepository documentRepository;

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    public Document getOne(Integer integer) {
        return documentRepository.getOne(integer);
    }

    public <S extends Document> S save(S s) {
        return documentRepository.save(s);
    }

    public Optional<Document> findById(Integer integer) {
        return documentRepository.findById(integer);
    }

    public boolean existsById(Integer integer) {
        return documentRepository.existsById(integer);
    }
}
