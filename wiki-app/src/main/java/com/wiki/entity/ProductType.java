package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@Table(name = "product_type")
@NamedQuery(name = "ProductType.findAll", query = "SELECT p FROM ProductType p")
public class ProductType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PDT_ID")
    private int pdtId;

    @Column(name = "PDT_DESCRIPTION")
    private String pdtDescription;

    public ProductType() {
    }

    public int getPdtId() {
        return pdtId;
    }

    public void setPdtId(int pdtId) {
        this.pdtId = pdtId;
    }

    public String getPdtDescription() {
        return pdtDescription;
    }

    public void setPdtDescription(String pdtDescription) {
        this.pdtDescription = pdtDescription;
    }
}