package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d")
public class Document implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DOC_ID")
    private int docId;

    @Column(name = "DOC_NUMBER")
    private String docNumber;

    @Column(name = "DOC_DEFAULT")
    private String docDefault;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOC_DCTID")
    private DocumentType documentType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOC_CUSID")
    private Customer customer;

    public Document() {
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocDefault() {
        return docDefault;
    }

    public void setDocDefault(String docDefault) {
        this.docDefault = docDefault;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}