package com.wiki.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wiki.entity.Customer;

/**
 * @author BodyBoardSS
 *
 */
public class AddressDto {
	@NotBlank
	private String addAddress;

	@NotNull
	private Customer customer;

	public String getAddAddress() {
		return addAddress;
	}

	public void setAddAddress(String addAddress) {
		this.addAddress = addAddress;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
