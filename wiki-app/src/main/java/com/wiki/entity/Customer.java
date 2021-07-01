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
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUS_ID")
	private int cusId;

	@Column(name = "CUS_CODE")
	private String cusCode;

	@Column(name = "CUS_LASTNAME")
	private String cusLastname;

	@Column(name = "CUS_NAME")
	private String cusName;

	@ManyToOne
	@JoinColumn(name = "CUS_CTYID")
	private City city;

	@ManyToOne
	@JoinColumn(name = "CUS_DOCID")
	private Document document;

	@OneToMany(mappedBy = "customer")
	private List<CustomerAdd> customerAdds;

	@OneToMany(mappedBy = "customer")
	private List<CustomerCel> customerCels;

	@OneToMany(mappedBy = "customer")
	private List<Invoice> invoices;

	public Customer() {
	}

	public int getCusId() {
		return this.cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusCode() {
		return this.cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public String getCusLastname() {
		return this.cusLastname;
	}

	public void setCusLastname(String cusLastname) {
		this.cusLastname = cusLastname;
	}

	public String getCusName() {
		return this.cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public List<CustomerAdd> getCustomerAdds() {
		return this.customerAdds;
	}

	public void setCustomerAdds(List<CustomerAdd> customerAdds) {
		this.customerAdds = customerAdds;
	}

	public CustomerAdd addCustomerAdd(CustomerAdd customerAdd) {
		getCustomerAdds().add(customerAdd);
		customerAdd.setCustomer(this);

		return customerAdd;
	}

	public CustomerAdd removeCustomerAdd(CustomerAdd customerAdd) {
		getCustomerAdds().remove(customerAdd);
		customerAdd.setCustomer(null);

		return customerAdd;
	}

	public List<CustomerCel> getCustomerCels() {
		return this.customerCels;
	}

	public void setCustomerCels(List<CustomerCel> customerCels) {
		this.customerCels = customerCels;
	}

	public CustomerCel addCustomerCel(CustomerCel customerCel) {
		getCustomerCels().add(customerCel);
		customerCel.setCustomer(this);

		return customerCel;
	}

	public CustomerCel removeCustomerCel(CustomerCel customerCel) {
		getCustomerCels().remove(customerCel);
		customerCel.setCustomer(null);

		return customerCel;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public Invoice addInvoice(Invoice invoice) {
		getInvoices().add(invoice);
		invoice.setCustomer(this);

		return invoice;
	}

	public Invoice removeInvoice(Invoice invoice) {
		getInvoices().remove(invoice);
		invoice.setCustomer(null);

		return invoice;
	}

}