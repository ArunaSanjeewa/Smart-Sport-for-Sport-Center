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
import javax.swing.JOptionPane;
import org.suslsport.sportmgtsystem.DatabaseConnection.DBConnection;
import org.suslsport.sportmgtsystem.model.Sport;

/**
 *
 * @author RedHunter
 */
public class SportController {

    public static boolean addSport(Sport sport) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = null;
        sql = "INSERT INTO sport VALUES(?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setObject(1, sport.getSId());
        preparedStatement.setObject(2, sport.getSportName());
       
        int executeUpdateRes = preparedStatement.executeUpdate();

        return executeUpdateRes > 0;

    }

    public static ArrayList<Sport> viewAllSports() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        conn = DBConnection.getDBConnection().getConn();
        String sql = "SELECT*FROM sport";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
        ResultSet result = prepareStatement.executeQuery();
        
        ArrayList<Sport> allSportList = new ArrayList<>();
        while (result.next()) {
            allSportList.add(new Sport(result.getString(1), result.getString(2)));
        }
        return allSportList;

    }
    public static boolean deleteSport(String sportId) throws SQLException, ClassNotFoundException{
        Connection conn;
        conn = DBConnection.getDBConnection().getConn();
        Statement deleteStatement = conn.createStatement();
        String sql =null;
        sql="DELETE FROM sport WHERE sport_id ='"+sportId+"'";
        int result = deleteStatement.executeUpdate(sql);
        return result>0;
        
        
    }
    public static ArrayList<String> getAllSportsNames() throws ClassNotFoundException, SQLException{
        Connection conn=null;
        ArrayList<String> sportNames = new ArrayList<>();
        conn =DBConnection.getDBConnection().getConn();
        Statement getAllSportName = conn.createStatement();
        String sql = null;
        sql="SELECT sport_name from sport";
        ResultSet result = getAllSportName.executeQuery(sql);
       
        while(result.next()){
            sportNames.add(result.getString(1));
        }
        return sportNames;
        
    }
    
    public static String getRelevantSportId(String sportName) throws ClassNotFoundException, SQLException{
        Connection conn =null;
        String sql=null;
        conn=DBConnection.getDBConnection().getConn();
        Statement getSportStatement = conn.createStatement();
        sql ="SELECT sid FROM sport WHERE sport_name='"+sportName+"'";
        ResultSet result = getSportStatement.executeQuery(sql);
        result.next();
        String sportId =result.getString(1);
   
        return sportId;

    }

}
