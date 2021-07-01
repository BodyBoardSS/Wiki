/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class ProductTypeDto {
	
	@NotBlank
	private String pdtDescription;

	public String getPdtDescription() {
		return pdtDescription;
	}

	public void setPdtDescription(String pdtDescription) {
		this.pdtDescription = pdtDescription;
	}
}
