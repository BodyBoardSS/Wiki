package com.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiki.entity.Invoice;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
