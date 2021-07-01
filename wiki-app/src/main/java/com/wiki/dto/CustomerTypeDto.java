/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class CustomerTypeDto {
	@NotBlank
	private String cutDescription;

	public String getCutDescription() {
		return cutDescription;
	}

	public void setCutDescription(String cutDescription) {
		this.cutDescription = cutDescription;
	}
}
