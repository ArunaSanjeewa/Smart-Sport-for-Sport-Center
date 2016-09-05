/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.model;

/**
 *
 * @author RedHunter
 */
public class Inventory {
    private String voucherId;
    private String date;
    private String fromWhom;

    public Inventory() {
    }

    public Inventory(String voucherId, String date, String fromWhom) {
        this.voucherId = voucherId;
        this.date = date;
        this.fromWhom = fromWhom;
    }

    
    public String getVoucherId() {
        return voucherId;
    }

    
    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    
    public String getDate() {
        return date;
    }

    
    public void setDate(String date) {
        this.date = date;
    }

    
    public String getFromWhom() {
        return fromWhom;
    }

    
    public void setFromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
    }
    
    
    
}
