/**
 * 
 */
package com.wiki.dto;

import javax.validation.constraints.NotBlank;

import com.wiki.entity.DocumentType;

/**
 * @author BodyBoardSS
 * 
 */
public class DocumentDto {
	@NotBlank
	private String docNumber;
	
	private DocumentType documentType;

	/**
	 * @return the docNumber
	 */
	public String getDocNumber() {
		return docNumber;
	}

	/**
	 * @param docNumber the docNumber to set
	 */
	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	/**
	 * @return the documentType
	 */
	public DocumentType getDocumentType() {
		return documentType;
	}

	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
}
