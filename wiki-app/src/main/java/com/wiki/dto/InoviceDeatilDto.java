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

	private BigDecimal detPrice;

	private Invoice invoice;
	
	private Product product;

	public BigDecimal getDetQuantity() {
		return detQuantity;
	}

	public void setDetQuantity(BigDecimal detQuantity) {
		this.detQuantity = detQuantity;
	}

	public BigDecimal getDetTotal() {
		return detTotal;
	}

	public void setDetTotal(BigDecimal detTotal) {
		this.detTotal = detTotal;
	}

	public BigDecimal getDetPrice() {
		return detPrice;
	}

	public void setDetPrice(BigDecimal detPrice) {
		this.detPrice = detPrice;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
