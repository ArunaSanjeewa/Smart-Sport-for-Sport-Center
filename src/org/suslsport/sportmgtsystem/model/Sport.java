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
public class Sport {
    private String sId;
    private String sportName;

    public Sport() {
    }
    
    public Sport(String sid, String sportName) {
        this.sId = sid;
        this.sportName = sportName;
        
    }
    
    public void setSId(String sId){
        this.sId=sId;    
    }
    public void setSportName(String sportName){
        this.sportName = sportName;
    }
   
    public String getSId(){
        return this.sId;
    }
    public String getSportName(){
        return this.sportName;
    }
   
    
    
}
