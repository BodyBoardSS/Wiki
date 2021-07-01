/**
 * 
 */
package com.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiki.entity.Document;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer>{

}
