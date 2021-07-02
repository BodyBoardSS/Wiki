package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@Table(name = "invoice_detail")
@NamedQuery(name = "InvoiceDetail.findAll", query = "SELECT i FROM InvoiceDetail i")
public class InvoiceDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "DET_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detId;

    @Column(name = "DET_QUANTITY")
    private BigDecimal detQuantity;

    @Column(name = "DET_TOTAL")
    private BigDecimal detTotal;

    @Column(name = "DET_PRICE")
    private BigDecimal detPrice;

    @ManyToOne
    @JoinColumn(name = "DET_INVID")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "DET_PRDID")
    private Product product;

    public InvoiceDetail() {
    }

    public int getDetId() {
        return detId;
    }

    public void setDetId(int detId) {
        this.detId = detId;
    }

    public BigDecimal getDetQuantity() {
        return detQuantity;
    }

    public void setDetQuantity(BigDecimal detQuantity) {
        this.detQuantity = detQuantity;
    }

    public BigDecimal getDetTotal() {
        return detTotal;
    }

    public void setDetTotal(BigDecimal detTotal) {
        this.detTotal = detTotal;
    }

    public BigDecimal getDetPrice() {
        return detPrice;
    }

    public void setDetPrice(BigDecimal detPrice) {
        this.detPrice = detPrice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}