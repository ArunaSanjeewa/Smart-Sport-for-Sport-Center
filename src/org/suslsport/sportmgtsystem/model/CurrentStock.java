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
public class CurrentStock {

    private String stockId;
    private String voucherId;
    private String itemId;

    private int quantity;

    public CurrentStock() {
    }

    public CurrentStock(String stockId, String voucherId,
                        String itemId, int quantity) {
        this.stockId = stockId;
        this.voucherId = voucherId;
        this.itemId = itemId;

        this.quantity = quantity;

    }

    public CurrentStock(String itemId, int quantity) {
        this.itemId = itemId;
        this.quantity = quantity;

    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStockId() {
        return this.stockId;
    }

    public String getVoucherId() {
        return this.voucherId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    /**
     * @return the brandName
     */
}
