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
import org.suslsport.sportmgtsystem.model.OutFromStock;
import org.suslsport.sportmgtsystem.view.OutFromStockView;

/**
 *
 * @author RedHunter
 */
public class OutFromStockController {
    public static boolean add(OutFromStock fromStock) throws ClassNotFoundException, SQLException{
        Connection conn =null;
        String sql;
        conn =DBConnection.getDBConnection().getConn();
        
        sql ="INSERT INTO out_from_cstock VALUES(?,?,?,?,?,?,?)";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setObject(1, fromStock.getDate());
        prepareStatement.setObject(2, fromStock.getStudentId());
        prepareStatement.setObject(3, fromStock.getContact());
        prepareStatement.setObject(4, fromStock.getItemId());
        prepareStatement.setObject(5, fromStock.getQuantity());
        prepareStatement.setObject(6, fromStock.isOutType());
        prepareStatement.setObject(7, fromStock.getOutedBy());
        int executeUpdate = prepareStatement.executeUpdate();
        return executeUpdate>0;


        
        
    }
    public static ArrayList<OutFromStock> viewAllOutThreds() throws SQLException, ClassNotFoundException{
        Connection conn;
        String sql;
        conn =DBConnection.getDBConnection().getConn();
        sql ="SELECT* FROM out_from_cstock ";
        Statement getAll = conn.createStatement();
        ResultSet allTrheds = getAll.executeQuery(sql);
        ArrayList<OutFromStock>  arrayList = new ArrayList<>();
        while (allTrheds.next()) {
            OutFromStock  fromStock=new OutFromStock(allTrheds.getString(1), allTrheds.getString(2), allTrheds.getString(3), allTrheds.getString(4), allTrheds.getInt(5), allTrheds.getBoolean(6), allTrheds.getString(7));
            arrayList.add(fromStock);
            
            
        }
        return arrayList;
        
    }
    public static ArrayList<OutFromStock> getNeedToReturn() throws SQLException, ClassNotFoundException{
        Connection conn;
        String sql;
        conn =DBConnection.getDBConnection().getConn();
        sql ="SELECT* FROM out_from_cstock WHERE out_type =1";
        Statement getAll = conn.createStatement();
        ResultSet allTrheds = getAll.executeQuery(sql);
        ArrayList<OutFromStock>  arrayList = new ArrayList<>();
        while (allTrheds.next()) {
            OutFromStock  fromStock=new OutFromStock(allTrheds.getString(1), allTrheds.getString(2), allTrheds.getString(3), allTrheds.getString(4), allTrheds.getInt(5), allTrheds.getBoolean(6), allTrheds.getString(7));
            arrayList.add(fromStock);
            
            
        }
        return arrayList;
        
    }
    public static boolean deleteRow(String itemId,String stdId) throws ClassNotFoundException, SQLException{
        Connection conn;
        String sql;
        conn =DBConnection.getDBConnection().getConn();
        sql ="DELETE FROM out_from_cstock WHERE date='"+itemId+"' AND student_id='"+stdId+"'";
        Statement getAll = conn.createStatement();
        int executeUpdate = getAll.executeUpdate(sql);
        return executeUpdate>0;
    }
    public static boolean updateRow(int q,String itemId,String stdId) throws ClassNotFoundException, SQLException{
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        Statement createStatement = conn.createStatement();
        sql = "UPDATE out_from_cstock SET quantity='"+q+"' WHERE date='"+itemId+"' AND student_id='"+stdId+"'";
        int executeUpdate = createStatement.executeUpdate(sql);
        
        return executeUpdate>0;
        
        
        
    }
    
}
