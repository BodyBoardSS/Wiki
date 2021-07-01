package com.wiki.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the document_type database table.
 * 
 */
@Entity
@Table(name = "document_type")
@NamedQuery(name = "DocumentType.findAll", query = "SELECT d FROM DocumentType d")
public class DocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DCT_ID")
	private int dctId;

	@Column(name = "DCT_DESCRIPTION")
	private String dctDescription;

	@OneToMany(mappedBy = "documentType")
	private List<Document> documents;

	public DocumentType() {
	}

	public int getDctId() {
		return this.dctId;
	}

	public void setDctId(int dctId) {
		this.dctId = dctId;
	}

	public String getDctDescription() {
		return this.dctDescription;
	}

	public void setDctDescription(String dctDescription) {
		this.dctDescription = dctDescription;
	}

	public List<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Document addDocument(Document document) {
		getDocuments().add(document);
		document.setDocumentType(this);

		return document;
	}

	public Document removeDocument(Document document) {
		getDocuments().remove(document);
		document.setDocumentType(null);

		return document;
	}

}