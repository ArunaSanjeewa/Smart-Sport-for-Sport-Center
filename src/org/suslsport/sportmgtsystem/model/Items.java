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
public class Items {

    private String itemId;
    private String itemName;

    private String sportId;

    public Items() {
    }

    public Items(String itemId, String itemName, String sportId) {
        this.itemId = itemId;
        this.itemName = itemName;

        this.sportId = sportId;
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
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the description
     */
    /**
     * @return the sportId
     */
    /**
     * @param sportId the sportId to set
     */
    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getSportId() {
        return sportId;
    }

}
