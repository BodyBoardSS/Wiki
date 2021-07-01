/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

import com.wiki.entity.Customer;

/**
 * @author BodyBoardSS
 *
 */
public class PhonesDto {
	
	@NotBlank
	private String celCellphone;
	
	private Customer customer;

	/**
	 * @return the celCellphone
	 */
	public String getCelCellphone() {
		return celCellphone;
	}

	/**
	 * @param celCellphone the celCellphone to set
	 */
	public void setCelCellphone(String celCellphone) {
		this.celCellphone = celCellphone;
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
}
