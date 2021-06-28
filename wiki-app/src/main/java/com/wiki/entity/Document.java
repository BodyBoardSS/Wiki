package com.wiki.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the document database table.
 * 
 */
@Entity
@NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d")
public class Document implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DOC_ID")
	private int docId;

	@Column(name = "DOC_NUMBER")
	private String docNumber;

	// bi-directional many-to-one association to Customer
	@OneToMany(mappedBy = "document")
	private List<Customer> customers;

	// bi-directional many-to-one association to DocumentType
	@ManyToOne
	@JoinColumn(name = "DOC_DCTID")
	private DocumentType documentType;

	// bi-directional many-to-one association to Supplier
	@OneToMany(mappedBy = "document")
	private List<Supplier> suppliers;

	public Document() {
	}

	public int getDocId() {
		return this.docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocNumber() {
		return this.docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setDocument(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setDocument(null);

		return customer;
	}

	public DocumentType getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public List<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Supplier addSupplier(Supplier supplier) {
		getSuppliers().add(supplier);
		supplier.setDocument(this);

		return supplier;
	}

	public Supplier removeSupplier(Supplier supplier) {
		getSuppliers().remove(supplier);
		supplier.setDocument(null);

		return supplier;
	}

}