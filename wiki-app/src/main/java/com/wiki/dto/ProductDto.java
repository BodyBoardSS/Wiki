/**
 * 
 */
package com.wiki.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.wiki.entity.ProductType;
import com.wiki.entity.Supplier;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public class ProductDto {
	
	private BigDecimal prdCost;

	private String prdDescription;

	private Date prdEntryDate;

	private BigDecimal prdPrice;

	private BigDecimal prdStock;

	private Supplier supplier;

	private ProductType productType;

	/**
	 * @return the prdCost
	 */
	public BigDecimal getPrdCost() {
		return prdCost;
	}

	/**
	 * @param prdCost the prdCost to set
	 */
	public void setPrdCost(BigDecimal prdCost) {
		this.prdCost = prdCost;
	}

	/**
	 * @return the prdDescription
	 */
	public String getPrdDescription() {
		return prdDescription;
	}

	/**
	 * @param prdDescription the prdDescription to set
	 */
	public void setPrdDescription(String prdDescription) {
		this.prdDescription = prdDescription;
	}

	/**
	 * @return the prdEntryDate
	 */
	public Date getPrdEntryDate() {
		return prdEntryDate;
	}

	/**
	 * @param prdEntryDate the prdEntryDate to set
	 */
	public void setPrdEntryDate(Date prdEntryDate) {
		this.prdEntryDate = prdEntryDate;
	}

	/**
	 * @return the prdPrice
	 */
	public BigDecimal getPrdPrice() {
		return prdPrice;
	}

	/**
	 * @param prdPrice the prdPrice to set
	 */
	public void setPrdPrice(BigDecimal prdPrice) {
		this.prdPrice = prdPrice;
	}

	/**
	 * @return the prdStock
	 */
	public BigDecimal getPrdStock() {
		return prdStock;
	}

	/**
	 * @param prdStock the prdStock to set
	 */
	public void setPrdStock(BigDecimal prdStock) {
		this.prdStock = prdStock;
	}

	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
}
