/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.controller;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.suslsport.sportmgtsystem.DatabaseConnection.DBConnection;
import org.suslsport.sportmgtsystem.model.CurrentStock;

/**
 *
 * @author RedHunter
 */
public class CurrentStockContrller {
    
      public static boolean addCurrentStock(CurrentStock  currentStock) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        sql ="INSERT INTO current_stock VALUES(?,?,?,?)";
        PreparedStatement pStatement = conn.prepareStatement(sql);
        pStatement.setObject(1, currentStock.getStockId());
        pStatement.setObject(2, currentStock.getVoucherId());
        
        pStatement.setObject(3, currentStock.getItemId());
        
        pStatement.setObject(4, currentStock.getQuantity());
        
        int executeUpdate = pStatement.executeUpdate();
       
        return executeUpdate>0;
        
        
    }
      public static ArrayList<CurrentStock> getCurrentStockItems(String voucherId) throws ClassNotFoundException, SQLException{
          Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = "SELECT item_id,quantity FROM current_stock WHERE voucher_id='"+voucherId+"'";
          java.sql.Statement createStatement = conn.createStatement();
          ResultSet resultSet = createStatement.executeQuery(sql);
        
       
        ArrayList<CurrentStock> allItemList = new ArrayList<>();
        while (resultSet.next()) {
            allItemList.add(new CurrentStock(resultSet.getString(1), resultSet.getInt(2)));
        }
        return allItemList;
        
        
        
          
      }
    
}
