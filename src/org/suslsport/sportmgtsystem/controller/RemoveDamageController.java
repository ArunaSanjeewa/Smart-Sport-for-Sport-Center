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
import java.util.ArrayList;
import org.suslsport.sportmgtsystem.DatabaseConnection.DBConnection;
import org.suslsport.sportmgtsystem.model.RemoveDamage;

/**
 *
 * @author RedHunter
 */
public class RemoveDamageController {

    public static boolean insertRow(RemoveDamage damage) throws ClassNotFoundException, SQLException {

        Connection conn = DBConnection.getDBConnection().getConn();
        String sql = "INSERT INTO remove_damage (date,item_id,quantity)values(?,?,?)";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setString(1, damage.getDate());
        prepareStatement.setString(2, damage.getItemId());
        prepareStatement.setInt(3, damage.getQuantity());
        
        int executeUpdate = prepareStatement.executeUpdate();
        return executeUpdate > 0;

    }
        public static ArrayList<RemoveDamage> viewAllReport() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = "SELECT*FROM remove_damage";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        ResultSet result = prepareStatement.executeQuery();
       
        ArrayList<RemoveDamage> allItemList = new ArrayList<>();
        while (result.next()) {
            allItemList.add(new RemoveDamage(result.getString(2), result.getString(3), result.getInt(4)));
        }
        return allItemList;

    }
}
