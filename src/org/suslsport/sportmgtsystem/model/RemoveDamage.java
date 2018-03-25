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
public class RemoveDamage {
    private String stockId;
    private String date;
    private String itemId;
    private int quantity;
    

    public RemoveDamage() {
    }

    public RemoveDamage(String stockId, String date, String itemId, int quantity) {
        this.stockId = stockId;
        this.date = date;
        this.itemId = itemId;
        this.quantity = quantity;
    }
   public RemoveDamage(String date, String itemId, int quantity) {
        
        this.date = date;
        this.itemId = itemId;
        this.quantity = quantity;
    }


    /**
     * @return the stockId
     */
    public String getStockId() {
        return stockId;
    }

    /**
     * @param stockId the stockId to set
     */
    public void setStockId(String stockId) {
        this.stockId = stockId;
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
     * @return the description
     */
 
    
    
}
