package com.wiki.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the method_payment database table.
 * 
 */
@Entity
@Table(name = "method_payment")
@NamedQuery(name = "MethodPayment.findAll", query = "SELECT m FROM MethodPayment m")
public class MethodPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MTP_ID")
	private int mtpId;

	@Column(name = "MTP_DESCRIPTION")
	private String mtpDescription;

	// bi-directional many-to-one association to Invoice
	@OneToMany(mappedBy = "methodPayment")
	private List<Invoice> invoices;

	public MethodPayment() {
	}

	public int getMtpId() {
		return this.mtpId;
	}

	public void setMtpId(int mtpId) {
		this.mtpId = mtpId;
	}

	public String getMtpDescription() {
		return this.mtpDescription;
	}

	public void setMtpDescription(String mtpDescription) {
		this.mtpDescription = mtpDescription;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Invoice addInvoice(Invoice invoice) {
		getInvoices().add(invoice);
		invoice.setMethodPayment(this);

		return invoice;
	}

	public Invoice removeInvoice(Invoice invoice) {
		getInvoices().remove(invoice);
		invoice.setMethodPayment(null);

		return invoice;
	}

}