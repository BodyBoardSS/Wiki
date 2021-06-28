package com.wiki.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the city database table.
 * 
 */
@Entity
@NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CTY_ID")
	private int ctyId;

	@Column(name = "CTY_NAME")
	private String ctyName;

	// bi-directional many-to-one association to Customer
	@OneToMany(mappedBy = "city")
	private List<Customer> customers;

	// bi-directional many-to-one association to Supplier
	@OneToMany(mappedBy = "city")
	private List<Supplier> suppliers;

	public City() {
	}

	public City(int ctyId, String ctyName, List<Customer> customers, List<Supplier> suppliers) {
		super();
		this.ctyId = ctyId;
		this.ctyName = ctyName;
		this.customers = customers;
		this.suppliers = suppliers;
	}

	public int getCtyId() {
		return this.ctyId;
	}

	public void setCtyId(int ctyId) {
		this.ctyId = ctyId;
	}

	public String getCtyName() {
		return this.ctyName;
	}

	public void setCtyName(String ctyName) {
		this.ctyName = ctyName;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setCity(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setCity(null);

		return customer;
	}

	public List<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Supplier addSupplier(Supplier supplier) {
		getSuppliers().add(supplier);
		supplier.setCity(this);

		return supplier;
	}

	public Supplier removeSupplier(Supplier supplier) {
		getSuppliers().remove(supplier);
		supplier.setCity(null);

		return supplier;
	}

}