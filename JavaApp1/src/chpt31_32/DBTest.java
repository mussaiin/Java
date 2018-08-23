/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt31_32;

import java.sql.*;

/**
 *
 * @author Nurlybek
 */
public class DBTest {
    public static void main(String[] args) {
        String myDriver = "com.mysql.jdbc.Driver";
        String myURL = "jdbc:mysql://127.0.0.1/test";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myURL, "root", "");
            System.out.println("Connected to db:test");
            String query = "SELECT * FROM STUDENTS";
            stmt = conn.createStatement();
            
            String insert = "insert into Students (id, name, surname, gpa)"+
                    "values (3, 'Alex', 'Taishigara', 2.0)";
            stmt.executeUpdate(insert);
            
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("id: "+rs.getInt(1));
                System.out.println("name: "+rs.getString(2));
                System.out.println("surname: "+rs.getString(3));
                System.out.println("gpa: "+rs.getDouble(4));
                System.out.println("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
