package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@Table(name = "phone")
@NamedQuery(name = "Phone.findAll", query = "SELECT c FROM Phone c")
public class Phone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CEL_ID")
    private int celId;

    @Column(name = "CEL_CELLPHONE")
    private String celCellphone;

    // bi-directional many-to-one association to Customer
    @ManyToOne
    @JoinColumn(name = "CEL_CUSID")
    private Customer customer;

    public Phone() {
    }

    public int getCelId() {
        return this.celId;
    }

    public void setCelId(int celId) {
        this.celId = celId;
    }

    public String getCelCellphone() {
        return this.celCellphone;
    }

    public void setCelCellphone(String celCellphone) {
        this.celCellphone = celCellphone;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}