package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SUP_ID")
    private int supId;

    @Column(name = "SUP_ADDRESS")
    private String supAddress;

    @Column(name = "SUP_LASTNAME")
    private String supLastname;

    @Column(name = "SUP_NAME")
    private String supName;

    @Column(name = "SUP_TRADENAME")
    private String supTradename;

    @ManyToOne
    @JoinColumn(name = "SUP_CTYID")
    private City city;

    @ManyToOne
    @JoinColumn(name = "SUP_DOCID")
    private Document document;

    public Supplier() {
    }

    public int getSupId() {
        return supId;
    }

    public void setSupId(int supId) {
        this.supId = supId;
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress;
    }

    public String getSupLastname() {
        return supLastname;
    }

    public void setSupLastname(String supLastname) {
        this.supLastname = supLastname;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSupTradename() {
        return supTradename;
    }

    public void setSupTradename(String supTradename) {
        this.supTradename = supTradename;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}