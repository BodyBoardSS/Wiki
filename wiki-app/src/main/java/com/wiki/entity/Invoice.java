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
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "INV_ID")
	private int invId;

	@Temporal(TemporalType.DATE)
	@Column(name = "INV_DATE")
	private Date invDate;

	@Column(name = "INV_EMPLOYEE")
	private String invEmployee;

	@Column(name = "INV_TOTAL")
	private BigDecimal invTotal;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name = "INV_CUSID")
	private Customer customer;

	// bi-directional many-to-one association to MethodPayment
	@ManyToOne
	@JoinColumn(name = "INV_MTPID")
	private MethodPayment methodPayment;

	// bi-directional many-to-one association to InvoiceDetail
	@OneToMany(mappedBy = "invoice")
	private List<InvoiceDetail> invoiceDetails;

	public Invoice() {
	}

	public int getInvId() {
		return this.invId;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public Date getInvDate() {
		return this.invDate;
	}

	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}

	public String getInvEmployee() {
		return this.invEmployee;
	}

	public void setInvEmployee(String invEmployee) {
		this.invEmployee = invEmployee;
	}

	public BigDecimal getInvTotal() {
		return this.invTotal;
	}

	public void setInvTotal(BigDecimal invTotal) {
		this.invTotal = invTotal;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public MethodPayment getMethodPayment() {
		return this.methodPayment;
	}

	public void setMethodPayment(MethodPayment methodPayment) {
		this.methodPayment = methodPayment;
	}

	public List<InvoiceDetail> getInvoiceDetails() {
		return this.invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetail> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	public InvoiceDetail addInvoiceDetail(InvoiceDetail invoiceDetail) {
		getInvoiceDetails().add(invoiceDetail);
		invoiceDetail.setInvoice(this);

		return invoiceDetail;
	}

	public InvoiceDetail removeInvoiceDetail(InvoiceDetail invoiceDetail) {
		getInvoiceDetails().remove(invoiceDetail);
		invoiceDetail.setInvoice(null);

		return invoiceDetail;
	}

}