/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DatNguyen
 */
public class ConnectionUtil {
     private static final String hostName = "127.0.0.1";
    private static final String dbName = "basicclassitptit";
    private static final String userName = "root";
    private static final String password = "0nlyl0ve";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName;

            Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
            System.out.println("Connect db successfully!");
            return conn;
        } catch (Exception e) {
            System.out.println("Error connect db:" + e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}


