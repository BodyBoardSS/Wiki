package com.wiki.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 */
@Entity
@NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUS_ID")
    private int cusId;

    @Column(name = "CUS_CODE")
    private String cusCode;

    @Column(name = "CUS_LASTNAME")
    private String cusLastname;

    @Column(name = "CUS_NAME")
    private String cusName;

    @ManyToOne
    @JoinColumn(name = "CUS_CTYID")
    private City city;

    @ManyToOne
    @JoinColumn(name = "CUS_CUTID")
    private CustomerType customerType;

    public Customer() {
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public String getCusLastname() {
        return cusLastname;
    }

    public void setCusLastname(String cusLastname) {
        this.cusLastname = cusLastname;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}