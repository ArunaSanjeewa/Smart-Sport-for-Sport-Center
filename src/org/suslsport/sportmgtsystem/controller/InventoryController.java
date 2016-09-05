/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.suslsport.sportmgtsystem.DatabaseConnection.DBConnection;
import org.suslsport.sportmgtsystem.model.Inventory;
import org.suslsport.sportmgtsystem.model.Items;

/**
 *
 * @author RedHunter
 */
public class InventoryController {
    public static boolean addInventory(Inventory inventory) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        sql ="INSERT INTO inventory VALUES(?,?,?)";
        PreparedStatement pStatement = conn.prepareStatement(sql);
        pStatement.setObject(1, inventory.getVoucherId());
        pStatement.setObject(2, inventory.getDate());
        
        pStatement.setObject(3, inventory.getFromWhom());
        int executeUpdate = pStatement.executeUpdate();
        
        return executeUpdate>0;
        
    }
    
     public static ArrayList<String> getAllVoucherId() throws ClassNotFoundException, SQLException{
        Connection conn=null;
        ArrayList<String> sportNames = new ArrayList<>();
        conn =DBConnection.getDBConnection().getConn();
        Statement getAllVoucherId = conn.createStatement();
        String sql = null;
        sql="SELECT voucher_id from inventory";
        ResultSet result = getAllVoucherId.executeQuery(sql);
        
        
        while(result.next()){
            sportNames.add(result.getString(1));
        }
        return sportNames;
        
    }
     public static ArrayList<Inventory> allVoucher() throws ClassNotFoundException, SQLException{
         Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = "SELECT*FROM inventory";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        ResultSet result = prepareStatement.executeQuery();
       
        ArrayList<Inventory> al = new ArrayList<>();
        while (result.next()) {
            al.add(new Inventory(result.getString(1), result.getString(2), result.getString(3)));
        }
        return al;
         
     }
    
}
