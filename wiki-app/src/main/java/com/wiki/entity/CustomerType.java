package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 */
@Entity
@Table(name = "customer_type")
@NamedQuery(name = "CustomerType.findAll", query = "SELECT c FROM CustomerType c")
public class CustomerType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUT_ID")
    private int cutId;

    @Column(name = "CUT_DESCRIPTION")
    private String cutDescription;

    public CustomerType() {
    }

    public int getCutId() {
        return this.cutId;
    }

    public void setCutId(int cutId) {
        this.cutId = cutId;
    }

    public String getCutDescription() {
        return this.cutDescription;
    }

    public void setCutDescription(String cutDescription) {
        this.cutDescription = cutDescription;
    }

}