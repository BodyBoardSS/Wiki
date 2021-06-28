package com.wiki.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the customer_add database table.
 * 
 */
@Entity
@Table(name = "customer_add")
@NamedQuery(name = "CustomerAdd.findAll", query = "SELECT c FROM CustomerAdd c")
public class CustomerAdd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ADD_ID")
	private int addId;

	@Column(name = "ADD_ADDRESS")
	private String addAddress;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name = "ADD_CUSID")
	private Customer customer;

	public CustomerAdd() {
	}

	public int getAddId() {
		return this.addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddAddress() {
		return this.addAddress;
	}

	public void setAddAddress(String addAddress) {
		this.addAddress = addAddress;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}