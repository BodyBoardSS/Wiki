package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@Table(name = "document_type")
@NamedQuery(name = "DocumentType.findAll", query = "SELECT d FROM DocumentType d")
public class DocumentType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DCT_ID")
    private int dctId;

    @Column(name = "DCT_DESCRIPTION")
    private String dctDescription;

    @Column(name = "DCT_MASK")
    private String dctMask;

    @Column(name = "DCT_PLACEHOLDER")
    private String dctPlaceholder;

    public DocumentType() {
    }

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