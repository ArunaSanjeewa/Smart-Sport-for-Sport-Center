/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.suslsport.sportmgtsystem.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RedHunter
 */
public class DBConnection {
     private static DBConnection dbconnection;
     private final Connection conn;

    public DBConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost/smartsportdb";
        String user ="root";
        String password ="";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, user, password);
    }
    
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        if(dbconnection==null){
            dbconnection =new DBConnection();
            
        }
        return dbconnection;
        
    }
    public Connection getConn(){
        return  this.conn;
    }
     
     
     
    
}
