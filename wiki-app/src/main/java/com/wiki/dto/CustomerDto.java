package com.wiki.dto;

import com.wiki.entity.City;
import com.wiki.entity.CustomerType;

/**
 * @author BodyBoardSS
 *
 */
public class CustomerDto {

	private int cusId;
	private String cusCode;
	private String cusLastname;
	private String cusName;
	private City city;
	private CustomerType customerType;

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public String getCusLastname() {
		return cusLastname;
	}

	public void setCusLastname(String cusLastname) {
		this.cusLastname = cusLastname;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
}
