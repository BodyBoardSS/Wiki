/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

/**
 * @author kevin_orellana
 *
 */
public class MethodPaymentDto {
	
	@NotBlank
	private String mtpDescription;

	/**
	 * @return the mtpDescription
	 */
	public String getMtpDescription() {
		return mtpDescription;
	}

	/**
	 * @param mtpDescription the mtpDescription to set
	 */
	public void setMtpDescription(String mtpDescription) {
		this.mtpDescription = mtpDescription;
	}
}
