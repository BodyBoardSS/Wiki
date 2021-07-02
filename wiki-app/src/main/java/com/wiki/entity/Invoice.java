package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INV_ID")
    private int invId;

    @Temporal(TemporalType.DATE)
    @Column(name = "INV_DATE")
    private Date invDate;

    @Column(name = "INV_EMPLOYEE")
    private String invEmployee;

    @Column(name = "INV_TOTAL")
    private BigDecimal invTotal;

    @ManyToOne
    @JoinColumn(name = "INV_CUSID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "INV_MTPID")
    private MethodPayment methodPayment;

    public Invoice() {
    }

    public int getInvId() {
        return this.invId;
    }

    public void setInvId(int invId) {
        this.invId = invId;
    }

    public Date getInvDate() {
        return this.invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public String getInvEmployee() {
        return this.invEmployee;
    }

    public void setInvEmployee(String invEmployee) {
        this.invEmployee = invEmployee;
    }

    public BigDecimal getInvTotal() {
        return this.invTotal;
    }

    public void setInvTotal(BigDecimal invTotal) {
        this.invTotal = invTotal;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public MethodPayment getMethodPayment() {
        return this.methodPayment;
    }

    public void setMethodPayment(MethodPayment methodPayment) {
        this.methodPayment = methodPayment;
    }
}