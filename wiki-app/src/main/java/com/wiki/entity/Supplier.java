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
 * The persistent class for the supplier database table.
 * 
 */
@Entity
@NamedQuery(name = "Supplier.findAll", query = "SELECT s FROM Supplier s")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SUP_ID")
	private int supId;

	@Column(name = "SUP_ADDRESS")
	private String supAddress;

	@Column(name = "SUP_LASTNAME")
	private String supLastname;

	@Column(name = "SUP_NAME")
	private String supName;

	@Column(name = "SUP_TRADENAME")
	private String supTradename;

	// bi-directional many-to-one association to Product
	@OneToMany(mappedBy = "supplier")
	private List<Product> products;

	// bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name = "SUP_CTYID")
	private City city;

	// bi-directional many-to-one association to Document
	@ManyToOne
	@JoinColumn(name = "SUP_DOCID")
	private Document document;

	public Supplier() {
	}

	public int getSupId() {
		return this.supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupAddress() {
		return this.supAddress;
	}

	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}

	public String getSupLastname() {
		return this.supLastname;
	}

	public void setSupLastname(String supLastname) {
		this.supLastname = supLastname;
	}

	public String getSupName() {
		return this.supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	public String getSupTradename() {
		return this.supTradename;
	}

	public void setSupTradename(String supTradename) {
		this.supTradename = supTradename;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setSupplier(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setSupplier(null);

		return product;
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

}