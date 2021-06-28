package com.wiki.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the invoice_detail database table.
 * 
 */
@Entity
@Table(name = "invoice_detail")
@NamedQuery(name = "InvoiceDetail.findAll", query = "SELECT i FROM InvoiceDetail i")
public class InvoiceDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "DET_QUANTITY")
	private BigDecimal detQuantity;

	@Column(name = "DET_TOTAL")
	private BigDecimal detTotal;

	// bi-directional many-to-one association to Invoice
	@ManyToOne
	@JoinColumn(name = "DET_INVID")
	private Invoice invoice;

	// bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name = "DET_PRDID")
	private Product product;

	public InvoiceDetail() {
	}

	public BigDecimal getDetQuantity() {
		return this.detQuantity;
	}

	public void setDetQuantity(BigDecimal detQuantity) {
		this.detQuantity = detQuantity;
	}

	public BigDecimal getDetTotal() {
		return this.detTotal;
	}

	public void setDetTotal(BigDecimal detTotal) {
		this.detTotal = detTotal;
	}

	public Invoice getInvoice() {
		return this.invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}