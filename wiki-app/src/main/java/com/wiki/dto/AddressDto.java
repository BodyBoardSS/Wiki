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
public class AddressDto {
	@NotBlank
	private String addAddress;

	private Customer customer;

	/**
	 * @return the addAddress
	 */
	public String getAddAddress() {
		return addAddress;
	}

	/**
	 * @param addAddress the addAddress to set
	 */
	public void setAddAddress(String addAddress) {
		this.addAddress = addAddress;
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
