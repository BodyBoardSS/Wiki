/**
 * 
 */
package com.wiki.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class CustomerTypeDto {
	private int cutId;

	@NotBlank
	private String cutDescription;

	public int getCutId() {
		return cutId;
	}

	public void setCutId(int cutId) {
		this.cutId = cutId;
	}

	public String getCutDescription() {
		return cutDescription;
	}

	public void setCutDescription(String cutDescription) {
		this.cutDescription = cutDescription;
	}
}
