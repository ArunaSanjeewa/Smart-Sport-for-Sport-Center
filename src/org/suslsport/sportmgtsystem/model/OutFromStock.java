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
public class OutFromStock {
    private int invoiceId;
    private String date;
    private String studentId;
    private String contact;
    private String itemId;
    private int quantity;
    private boolean outType;
   

    public OutFromStock() {
    }

    public OutFromStock(int invoiceId, String date, String studentId, String contact, String itemId, int quantity, boolean outType) {
        this.invoiceId = invoiceId;
        this.date = date;
        this.studentId = studentId;
        this.contact = contact;
        this.itemId = itemId;
        this.quantity = quantity;
        this.outType = outType;
        
    }

    public OutFromStock(String date, String studentId, String contact, String itemId, int quantity, boolean outType) {
        this.invoiceId = invoiceId;
        this.date = date;
        this.studentId = studentId;
        this.contact = contact;
        this.itemId = itemId;
        this.quantity = quantity;
        this.outType = outType;
        
    }


    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the outType
     */
    public boolean isOutType() {
        return outType;
    }

    /**
     * @param outType the outType to set
     */
    public void setOutType(boolean outType) {
        this.outType = outType;
    }

    /**
     * @return the outedBy
     */
 
    /**
     * @return the invoiceId
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }
    
    

    
}