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
 * The persistent class for the product_type database table.
 * 
 */
@Entity
@Table(name = "product_type")
@NamedQuery(name = "ProductType.findAll", query = "SELECT p FROM ProductType p")
public class ProductType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PDT_ID")
	private int pdtId;

	@Column(name = "PDT_DESCRIPTION")
	private String pdtDescription;

	// bi-directional many-to-one association to Product
	@OneToMany(mappedBy = "productType")
	private List<Product> products;

	public ProductType() {
	}

	public int getPdtId() {
		return this.pdtId;
	}

	public void setPdtId(int pdtId) {
		this.pdtId = pdtId;
	}

	public String getPdtDescription() {
		return this.pdtDescription;
	}

	public void setPdtDescription(String pdtDescription) {
		this.pdtDescription = pdtDescription;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setProductType(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setProductType(null);

		return product;
	}

}