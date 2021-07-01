/**
 * 
 */
package com.wiki.dto;

import java.math.BigDecimal;

import com.wiki.entity.Invoice;
import com.wiki.entity.Product;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public class InoviceDeatilDto {
	private BigDecimal detQuantity;

	private BigDecimal detTotal;

	private Invoice invoice;
	
	private Product product;

	/**
	 * @return the detQuantity
	 */
	public BigDecimal getDetQuantity() {
		return detQuantity;
	}

	/**
	 * @param detQuantity the detQuantity to set
	 */
	public void setDetQuantity(BigDecimal detQuantity) {
		this.detQuantity = detQuantity;
	}

	/**
	 * @return the detTotal
	 */
	public BigDecimal getDetTotal() {
		return detTotal;
	}

	/**
	 * @param detTotal the detTotal to set
	 */
	public void setDetTotal(BigDecimal detTotal) {
		this.detTotal = detTotal;
	}

	/**
	 * @return the invoice
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice the invoice to set
	 */
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}
}
