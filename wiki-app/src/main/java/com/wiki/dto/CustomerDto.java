/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

import com.wiki.entity.City;
import com.wiki.entity.CustomerType;

/**
 * @author kevin_orellana
 *
 */
public class CustomerDto {
	
	private String cusCode;

	private String cusLastname;
	
	@NotBlank
	private String cusName;

	private City city;
	
	private CustomerType customerType;
	
	/**
	 * @return the customerType
	 */
	public CustomerType getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	/**
	 * @return the cusCode
	 */
	public String getCusCode() {
		return cusCode;
	}

	/**
	 * @param cusCode the cusCode to set
	 */
	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	/**
	 * @return the cusLastname
	 */
	public String getCusLastname() {
		return cusLastname;
	}

	/**
	 * @param cusLastname the cusLastname to set
	 */
	public void setCusLastname(String cusLastname) {
		this.cusLastname = cusLastname;
	}

	/**
	 * @return the cusName
	 */
	public String getCusName() {
		return cusName;
	}

	/**
	 * @param cusName the cusName to set
	 */
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
}
