/**
 * 
 */
package com.wiki.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.wiki.entity.Customer;
import com.wiki.entity.MethodPayment;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public class InvoiceDto {
	
	private Date invDate;

	private String invEmployee;

	private BigDecimal invTotal;

	private Customer customer;

	private MethodPayment methodPayment;

	/**
	 * @return the invDate
	 */
	public Date getInvDate() {
		return invDate;
	}

	/**
	 * @param invDate the invDate to set
	 */
	public void setInvDate(Date invDate) {
		this.invDate = invDate;
	}

	/**
	 * @return the invEmployee
	 */
	public String getInvEmployee() {
		return invEmployee;
	}

	/**
	 * @param invEmployee the invEmployee to set
	 */
	public void setInvEmployee(String invEmployee) {
		this.invEmployee = invEmployee;
	}

	/**
	 * @return the invTotal
	 */
	public BigDecimal getInvTotal() {
		return invTotal;
	}

	/**
	 * @param invTotal the invTotal to set
	 */
	public void setInvTotal(BigDecimal invTotal) {
		this.invTotal = invTotal;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the methodPayment
	 */
	public MethodPayment getMethodPayment() {
		return methodPayment;
	}

	/**
	 * @param methodPayment the methodPayment to set
	 */
	public void setMethodPayment(MethodPayment methodPayment) {
		this.methodPayment = methodPayment;
	}
}
