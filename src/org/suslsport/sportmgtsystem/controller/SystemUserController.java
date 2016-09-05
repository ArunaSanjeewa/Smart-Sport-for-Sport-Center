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
import org.suslsport.sportmgtsystem.model.SystemUsers;

/**
 *
 * @author RedHunter
 */
public class SystemUserController {
    public static boolean addSystemUsers(SystemUsers systemUser) throws SQLException, ClassNotFoundException{
        Connection conn=null;
        conn=DBConnection.getDBConnection().getConn();
        Statement createStatement = conn.createStatement();
        String sql="INSERT INTO system_users VALUES('"+systemUser.getFullName()+"','"+systemUser.getUserName()+"',password('"+systemUser.getPassword()+"'))";
        int executeUpdate = createStatement.executeUpdate(sql);
        return executeUpdate>0;
    }
    public static ArrayList<SystemUsers> getAll() throws ClassNotFoundException, SQLException{
        ArrayList<SystemUsers> arrayList = new ArrayList<>();
        Connection conn=null;
        conn = DBConnection.getDBConnection().getConn();
        String sql="SELECT full_name,user_name FROM system_users";
        Statement createStatement = conn.createStatement();
        ResultSet executeQuery = createStatement.executeQuery(sql);
        while(executeQuery.next()){
            String fName = executeQuery.getString(1);
            String uName = executeQuery.getString(2);
            SystemUsers su =new SystemUsers(fName, uName);
            arrayList.add(su);
        }
        return arrayList;
    }
    public static ArrayList<SystemUsers> viewAllItems() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = "SELECT*FROM system_users";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        ResultSet result = prepareStatement.executeQuery();
       
        ArrayList<SystemUsers> allItemList = new ArrayList<>();
        while (result.next()) {
            allItemList.add(new SystemUsers(result.getString(1), result.getString(2), result.getString(3)));
        }
        return allItemList;

    }
   }
