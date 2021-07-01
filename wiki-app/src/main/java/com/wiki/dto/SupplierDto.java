/**
 * 
 */
package com.wiki.dto;

import com.wiki.entity.City;
import com.wiki.entity.Document;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
public class SupplierDto {
	
	private String supAddress;

	private String supLastname;

	private String supName;

	private String supTradename;
	
	private City city;
	
	private Document document;

	/**
	 * @return the supAddress
	 */
	public String getSupAddress() {
		return supAddress;
	}

	/**
	 * @param supAddress the supAddress to set
	 */
	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}

	/**
	 * @return the supLastname
	 */
	public String getSupLastname() {
		return supLastname;
	}

	/**
	 * @param supLastname the supLastname to set
	 */
	public void setSupLastname(String supLastname) {
		this.supLastname = supLastname;
	}

	/**
	 * @return the supName
	 */
	public String getSupName() {
		return supName;
	}

	/**
	 * @param supName the supName to set
	 */
	public void setSupName(String supName) {
		this.supName = supName;
	}

	/**
	 * @return the supTradename
	 */
	public String getSupTradename() {
		return supTradename;
	}

	/**
	 * @param supTradename the supTradename to set
	 */
	public void setSupTradename(String supTradename) {
		this.supTradename = supTradename;
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

	/**
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * @param document the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}
}
