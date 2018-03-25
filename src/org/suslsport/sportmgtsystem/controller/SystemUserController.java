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

    public static boolean addSystemUsers(SystemUsers systemUser) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        Statement createStatement = conn.createStatement();
        String sql = "INSERT INTO system_users VALUES('" + systemUser.getFullName() + "','" + systemUser.getUserName() + "','" + systemUser.getPassword() + "')";
        int executeUpdate = createStatement.executeUpdate(sql);
        return executeUpdate > 0;
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

    public static boolean checkUser(SystemUsers su) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        sql="SELECT * FROM system_users WHERE user_name=? AND password=?";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        
        prepareStatement.setString(1, su.getUserName());
        prepareStatement.setString(2, su.getPassword());

        ResultSet executeQuery = prepareStatement.executeQuery();
        boolean last = executeQuery.last();
        return last;
    }
}
