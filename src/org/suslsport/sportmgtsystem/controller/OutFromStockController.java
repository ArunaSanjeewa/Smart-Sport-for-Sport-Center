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

    public static boolean add(OutFromStock fromStock) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String sql;
        conn = DBConnection.getDBConnection().getConn();

        sql = "INSERT INTO  out_from_cstock(date,student_id,contact_no,item_id,quantity,out_type) VALUES(?,?,?,?,?,?)";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setObject(1, fromStock.getDate());
        prepareStatement.setObject(2, fromStock.getStudentId());
        prepareStatement.setObject(3, fromStock.getContact());
        prepareStatement.setObject(4, fromStock.getItemId());
        prepareStatement.setObject(5, fromStock.getQuantity());
        prepareStatement.setObject(6, fromStock.isOutType());

        int executeUpdate = prepareStatement.executeUpdate();
        return executeUpdate > 0;

    }

    public static ArrayList<OutFromStock> viewAllOutThreds() throws SQLException, ClassNotFoundException {
        Connection conn;
        String sql;
        conn = DBConnection.getDBConnection().getConn();
        sql = "SELECT* FROM out_from_cstock ";
        Statement getAll = conn.createStatement();
        ResultSet allTrheds = getAll.executeQuery(sql);
        ArrayList<OutFromStock> arrayList = new ArrayList<>();
        while (allTrheds.next()) {
            OutFromStock fromStock = null;
            fromStock = new OutFromStock(allTrheds.getInt(1), allTrheds.getString(2), allTrheds.getString(3), allTrheds.getString(4), allTrheds.getString(5), allTrheds.getInt(6), allTrheds.getBoolean(7));
            arrayList.add(fromStock);

        }
        return arrayList;

    }

    public static ArrayList<OutFromStock> getNeedToReturn() throws SQLException, ClassNotFoundException {
        Connection conn;
        String sql;
        conn = DBConnection.getDBConnection().getConn();
        sql = "SELECT* FROM out_from_cstock WHERE out_type =1";
        Statement getAll = conn.createStatement();
        ResultSet allTrheds = getAll.executeQuery(sql);
        ArrayList<OutFromStock> arrayList = new ArrayList<>();
        while (allTrheds.next()) {
            OutFromStock fromStock = new OutFromStock(allTrheds.getInt(1), allTrheds.getString(2), allTrheds.getString(3), allTrheds.getString(4), allTrheds.getString(5), allTrheds.getInt(6), allTrheds.getBoolean(7));
            arrayList.add(fromStock);

        }
        return arrayList;

    }

    public static boolean deleteRow(int id) throws ClassNotFoundException, SQLException {
        Connection conn;
        String sql;
        conn = DBConnection.getDBConnection().getConn();
        sql = "DELETE FROM out_from_cstock WHERE invoice_id='" + id + "'";
        Statement getAll = conn.createStatement();
        int executeUpdate = getAll.executeUpdate(sql);
        return executeUpdate > 0;
    }

    public static boolean updateRow(int q,int invoiceID) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        Statement createStatement = conn.createStatement();
        sql = "UPDATE out_from_cstock SET quantity='" + q + "' WHERE invoice_id='" + invoiceID + "'";
        int executeUpdate = createStatement.executeUpdate(sql);

        return executeUpdate > 0;

    }

    public static ArrayList<OutFromStock> searchInvoice(String id) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String sql;
        conn = DBConnection.getDBConnection().getConn();

        sql = "SELECT * FROM out_from_cstock WHERE student_id=?";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        prepareStatement.setObject(1, id);

        ResultSet executeQuery = prepareStatement.executeQuery();
        ArrayList<OutFromStock> arrayList = new ArrayList<>();
        
        while (executeQuery.next()) {
            OutFromStock fromStock = new OutFromStock(executeQuery.getInt(1), executeQuery.getString(2), executeQuery.getString(3), executeQuery.getString(4), executeQuery.getString(5), executeQuery.getInt(6), executeQuery.getBoolean(7));
            arrayList.add(fromStock);

        }
        return arrayList;

    }

}
