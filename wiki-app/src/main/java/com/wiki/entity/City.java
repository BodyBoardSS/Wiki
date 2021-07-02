package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 */
@Entity
@NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
public class City implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CTY_ID")
    private int ctyId;

    @Column(name = "CTY_NAME")
    private String ctyName;

    public City() {
    }

    public City(String ctyName) {
        this.ctyName = ctyName;
    }

    public int getCtyId() {
        return this.ctyId;
    }

    public void setCtyId(int ctyId) {
        this.ctyId = ctyId;
    }

    public String getCtyName() {
        return this.ctyName;
    }

    public void setCtyName(String ctyName) {
        this.ctyName = ctyName;
    }

}