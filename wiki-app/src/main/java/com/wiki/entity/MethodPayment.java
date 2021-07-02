package com.wiki.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author BodyBoardSS
 * Date: 2021-06-30
 */
@Entity
@Table(name = "method_payment")
@NamedQuery(name = "MethodPayment.findAll", query = "SELECT m FROM MethodPayment m")
public class MethodPayment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MTP_ID")
    private int mtpId;

    @Column(name = "MTP_DESCRIPTION")
    private String mtpDescription;

    public MethodPayment() {
    }

    public int getMtpId() {
        return mtpId;
    }

    public void setMtpId(int mtpId) {
        this.mtpId = mtpId;
    }

    public String getMtpDescription() {
        return mtpDescription;
    }

    public void setMtpDescription(String mtpDescription) {
        this.mtpDescription = mtpDescription;
    }
}