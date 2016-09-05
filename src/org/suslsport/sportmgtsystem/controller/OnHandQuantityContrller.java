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
import org.suslsport.sportmgtsystem.model.OnHandQuantity;

/**
 *
 * @author RedHunter
 */
public class OnHandQuantityContrller {
    static String quantity;
    
    public static ResultSet checkRow(String itemId) throws SQLException, ClassNotFoundException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        Statement createStatement = conn.createStatement();
        
        
        sql ="SELECT* FROM on_hand_quantity WHERE item_id='"+itemId+"'";
        ResultSet executeQuery = createStatement.executeQuery(sql);
        
        return executeQuery;
        
        
        
    }
    public static boolean checkAddRow(String itemId) throws SQLException, ClassNotFoundException{
        ResultSet checkRow = checkRow(itemId);
        if (checkRow.last()) {
           
            return true;
        }else{
            return false;
        }
    }
    
    
    public static boolean addRow(OnHandQuantity handQuantity) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        Statement createStatement = conn.createStatement();
        
        
        
        sql ="INSERT INTO on_hand_quantity VALUES('"+handQuantity.getItemId()+"','"+handQuantity.getQuantity()+"')";
        int executeUpdate = createStatement.executeUpdate(sql);
        
        return executeUpdate>0;
    }
    public static boolean updateRow(OnHandQuantity handQuantity) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        Statement createStatement = conn.createStatement();
        sql = "UPDATE on_hand_quantity SET quantity='"+handQuantity.getQuantity()+"' WHERE item_id='"+handQuantity.getItemId()+"' ";
        int executeUpdate = createStatement.executeUpdate(sql);
        
        return executeUpdate>0;
        
        
        
    }
    public static ArrayList<OnHandQuantity> viewAllItems() throws SQLException, ClassNotFoundException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql=null;
        sql="SELECT * FROM on_hand_quantity";
        Statement getAllItems = conn.createStatement();
        ResultSet all = getAllItems.executeQuery(sql);
        ArrayList<OnHandQuantity> arrayList = new ArrayList<>();
        while (all.next()) { 
            OnHandQuantity handQuantity = new OnHandQuantity(all.getString(1),all.getInt(2));
            arrayList.add(handQuantity);
            
        }
        return arrayList;
        
    }
    public static ArrayList<OnHandQuantity> getItemsRelevantToSports(String sportId) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        String sql=null;
        conn=DBConnection.getDBConnection().getConn();
        sql="SELECT*FROM on_hand_quantity WHERE item_id LIKE ?";
        PreparedStatement getItems = conn.prepareStatement(sql);
        getItems.setString(1,sportId+"%");
        ResultSet executeQuery = getItems.executeQuery();
        ArrayList<OnHandQuantity> al = new ArrayList<>();
       
        while (executeQuery.next()) {
            String itemId = executeQuery.getString(1);
            int quantity = executeQuery.getInt(2);
            
            al.add(new OnHandQuantity(itemId, quantity));
            
            
        }
        return al;
    }
    public static int getRelevantQuantity(String itemId) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        int quan = 0;
        String sql=null;
        conn=DBConnection.getDBConnection().getConn();
        Statement createStatement = conn.createStatement();
        sql="SELECT quantity FROM on_hand_quantity WHERE item_id='"+itemId+"'";
        ResultSet executeQuery = createStatement.executeQuery(sql);
        while(executeQuery.next()){
            quan = executeQuery.getInt(1);
        }
        
        return quan;
    }
    public static boolean updateRowOuting(OnHandQuantity handQuantity) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        Statement createStatement = conn.createStatement();
        sql = "UPDATE on_hand_quantity SET quantity=(quantity-'"+handQuantity.getQuantity()+"') WHERE item_id='"+handQuantity.getItemId()+"'";
        int executeUpdate = createStatement.executeUpdate(sql);
        
        return executeUpdate>0;
        
        
        
    }
}
