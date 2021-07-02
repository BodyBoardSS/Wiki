package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRD_ID")
    private int prdId;

    @Column(name = "PRD_COST")
    private BigDecimal prdCost;

    @Column(name = "PRD_DESCRIPTION")
    private String prdDescription;

    @Temporal(TemporalType.DATE)
    @Column(name = "PRD_ENTRY_DATE")
    private Date prdEntryDate;

    @Column(name = "PRD_PRICE")
    private BigDecimal prdPrice;

    @Column(name = "PRD_STOCK")
    private BigDecimal prdStock;

    @ManyToOne
    @JoinColumn(name = "PRD_SUPID")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "PRD_PDTID")
    private ProductType productType;

    public Product() {
    }

    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public BigDecimal getPrdCost() {
        return prdCost;
    }

    public void setPrdCost(BigDecimal prdCost) {
        this.prdCost = prdCost;
    }

    public String getPrdDescription() {
        return prdDescription;
    }

    public void setPrdDescription(String prdDescription) {
        this.prdDescription = prdDescription;
    }

    public Date getPrdEntryDate() {
        return prdEntryDate;
    }

    public void setPrdEntryDate(Date prdEntryDate) {
        this.prdEntryDate = prdEntryDate;
    }

    public BigDecimal getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(BigDecimal prdPrice) {
        this.prdPrice = prdPrice;
    }

    public BigDecimal getPrdStock() {
        return prdStock;
    }

    public void setPrdStock(BigDecimal prdStock) {
        this.prdStock = prdStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}