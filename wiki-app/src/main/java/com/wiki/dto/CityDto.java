/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class CityDto {
	
	@NotBlank
	private String ctyName;

	public String getCtyName() {
		return ctyName;
	}

	public void setCtyName(String ctyName) {
		this.ctyName = ctyName;
	}
}
