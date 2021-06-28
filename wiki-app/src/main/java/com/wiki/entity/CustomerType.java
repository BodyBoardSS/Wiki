package com.wiki.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the customer_type database table.
 * 
 */
@Entity
@Table(name = "customer_type")
@NamedQuery(name = "CustomerType.findAll", query = "SELECT c FROM CustomerType c")
public class CustomerType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CUT_ID")
	private int cutId;

	@Column(name = "CUT_DESCRIPTION")
	private String cutDescription;

	public CustomerType() {
	}

	public int getCutId() {
		return this.cutId;
	}

	public void setCutId(int cutId) {
		this.cutId = cutId;
	}

	public String getCutDescription() {
		return this.cutDescription;
	}

	public void setCutDescription(String cutDescription) {
		this.cutDescription = cutDescription;
	}

}