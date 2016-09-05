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
import org.suslsport.sportmgtsystem.model.Items;
import org.suslsport.sportmgtsystem.model.Sport;

/**
 *
 * @author RedHunter
 */
public class ItemController {
    public static boolean addItems(Items item) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        sql ="INSERT INTO items VALUES(?,?,?)";
        PreparedStatement pStatement = conn.prepareStatement(sql);
        pStatement.setObject(1, item.getItemId());
        pStatement.setObject(2, item.getItemName());
        
        pStatement.setObject(3, item.getSportId());
        int executeUpdate = pStatement.executeUpdate();
        
        return executeUpdate>0;
        
    }
    public static String getLastId(String s) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        sql ="SELECT item_id FROM items WHERE sport_id =?";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setString(1,s);
        ResultSet res = prepareStatement.executeQuery();
        
       
        String lastId =null;
        String last = null;
        if (res.next()) {
            if(res.last()){
            lastId = res.getString(1);
            
            String[] splitting=lastId.split("(?<=\\D)(?=\\d)");
            String integerPart= splitting[1];            
            int convert = Integer.parseInt(integerPart);
            int newIdPart = convert+1;
            String toString = Integer.toString(newIdPart);
            last=s+""+toString;
           
 
        }
            
        }else{
            return s+"1001";
        }
        
        return last;
    }
    public static ArrayList<Items> viewAllItems() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = "SELECT*FROM items";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        ResultSet result = prepareStatement.executeQuery();
       
        ArrayList<Items> allItemList = new ArrayList<>();
        while (result.next()) {
            allItemList.add(new Items(result.getString(1), result.getString(2), result.getString(3)));
        }
        return allItemList;

    }
    
    public static ArrayList<String> getAllItemName() throws ClassNotFoundException, SQLException{
        Connection conn=null;
        ArrayList<String> sportNames = new ArrayList<>();
        conn =DBConnection.getDBConnection().getConn();
        Statement getAllItemName = conn.createStatement();
        String sql = null;
        sql="SELECT item_name,item_id from items";
        ResultSet result = getAllItemName.executeQuery(sql);
        
        while(result.next()){
            sportNames.add(result.getString(1));
        }
        return sportNames;
        
    }
       public static String getRelevantItemId(String itemName) throws ClassNotFoundException, SQLException{
        Connection conn =null;
        String sql=null;
        conn=DBConnection.getDBConnection().getConn();
        Statement getItemStatement = conn.createStatement();
        sql ="SELECT item_id FROM items WHERE item_name='"+itemName+"'";
        ResultSet result = getItemStatement.executeQuery(sql);
        result.last();
        String id =result.getString(1);
        
   
        return id;

    }
       public static String getReleventItemName(String itemId) throws SQLException, ClassNotFoundException{
           Connection conn=null;
           String itemName=null;
           String sql =null;
           conn = DBConnection.getDBConnection().getConn();
           Statement createStatement = conn.createStatement();
           sql = "SELECT item_name from items WHERE item_id='"+itemId+"'";
           ResultSet executeQuery = createStatement.executeQuery(sql);
           if (executeQuery.next()) {
               itemName = executeQuery.getString(1);
               
           }
        
           return itemName;
           
           
           
       }
       
}


