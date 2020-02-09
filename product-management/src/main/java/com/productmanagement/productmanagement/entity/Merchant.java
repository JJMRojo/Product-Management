package com.productmanagement.productmanagement.entity;

import javax.persistence.*;

@Entity
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int merchant_id;

    @Column(name = "merchant_name", nullable = false)
    private String merchant_name;

    public int getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(int merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }
}
