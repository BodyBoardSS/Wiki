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
 * The persistent class for the customer_cel database table.
 * 
 */
@Entity
@Table(name = "customer_cel")
@NamedQuery(name = "CustomerCel.findAll", query = "SELECT c FROM CustomerCel c")
public class CustomerCel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CEL_ID")
	private int celId;

	@Column(name = "CEL_CELLPHONE")
	private String celCellphone;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name = "CEL_CUSID")
	private Customer customer;

	public CustomerCel() {
	}

	public int getCelId() {
		return this.celId;
	}

	public void setCelId(int celId) {
		this.celId = celId;
	}

	public String getCelCellphone() {
		return this.celCellphone;
	}

	public void setCelCellphone(String celCellphone) {
		this.celCellphone = celCellphone;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}