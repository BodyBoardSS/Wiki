/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class DocumentTypeDto {
	
	@NotBlank
	private String dctDescription;

	public String getDctDescription() {
		return dctDescription;
	}

	public void setDctDescription(String dctDescription) {
		this.dctDescription = dctDescription;
	}
}
