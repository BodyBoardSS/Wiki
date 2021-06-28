package com.wiki.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
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

	// bi-directional many-to-one association to InvoiceDetail
	@OneToMany(mappedBy = "product")
	private List<InvoiceDetail> invoiceDetails;

	// bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name = "PRD_SUPID")
	private Supplier supplier;

	// bi-directional many-to-one association to ProductType
	@ManyToOne
	@JoinColumn(name = "PRD_PDTID")
	private ProductType productType;

	public Product() {
	}

	public int getPrdId() {
		return this.prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public BigDecimal getPrdCost() {
		return this.prdCost;
	}

	public void setPrdCost(BigDecimal prdCost) {
		this.prdCost = prdCost;
	}

	public String getPrdDescription() {
		return this.prdDescription;
	}

	public void setPrdDescription(String prdDescription) {
		this.prdDescription = prdDescription;
	}

	public Date getPrdEntryDate() {
		return this.prdEntryDate;
	}

	public void setPrdEntryDate(Date prdEntryDate) {
		this.prdEntryDate = prdEntryDate;
	}

	public BigDecimal getPrdPrice() {
		return this.prdPrice;
	}

	public void setPrdPrice(BigDecimal prdPrice) {
		this.prdPrice = prdPrice;
	}

	public BigDecimal getPrdStock() {
		return this.prdStock;
	}

	public void setPrdStock(BigDecimal prdStock) {
		this.prdStock = prdStock;
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return this.invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	public InvoiceDetail addInvoiceDetail(InvoiceDetail invoiceDetail) {
		getInvoiceDetails().add(invoiceDetail);
		invoiceDetail.setProduct(this);

		return invoiceDetail;
	}

	public InvoiceDetail removeInvoiceDetail(InvoiceDetail invoiceDetail) {
		getInvoiceDetails().remove(invoiceDetail);
		invoiceDetail.setProduct(null);

		return invoiceDetail;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public ProductType getProductType() {
		return this.productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}