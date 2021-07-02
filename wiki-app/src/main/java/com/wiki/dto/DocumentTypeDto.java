package com.wiki.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class DocumentTypeDto {

	private int dctId;

	@NotBlank
	private String dctDescription;

	private String dctMask;

	private String dctPlaceholder;

	public int getDctId() {
		return dctId;
	}

	public void setDctId(int dctId) {
		this.dctId = dctId;
	}

	public String getDctDescription() {
		return dctDescription;
	}

	public void setDctDescription(String dctDescription) {
		this.dctDescription = dctDescription;
	}

	public String getDctMask() {
		return dctMask;
	}

	public void setDctMask(String dctMask) {
		this.dctMask = dctMask;
	}

	public String getDctPlaceholder() {
		return dctPlaceholder;
	}

	public void setDctPlaceholder(String dctPlaceholder) {
		this.dctPlaceholder = dctPlaceholder;
	}
}
