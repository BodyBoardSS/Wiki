package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@Table(name = "address")
@NamedQuery(name = "Address.findAll", query = "SELECT c FROM Address c")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADD_ID")
    private int addId;

    @Column(name = "ADD_ADDRESS")
    private String addAddress;

    @ManyToOne
    @JoinColumn(name = "ADD_CUSID")
    private Customer customer;

    public Address() {
    }

    public int getAddId() {
        return this.addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getAddAddress() {
        return this.addAddress;
    }

    public void setAddAddress(String addAddress) {
        this.addAddress = addAddress;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

