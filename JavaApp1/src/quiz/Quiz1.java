/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nurlybek
 */
public class Quiz1{
    public static void main(String[] args) throws Exception{
        ObjectInputStream inn = new ObjectInputStream(new FileInputStream(new File("f.dat")));
	String[] text = (String[]) inn.readObject();
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myURL = "jdbc:mysql://127.0.0.1/test";
            Connection conn=DriverManager.getConnection(myURL, "root", "");
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM QUIZ";
            ResultSet rs;
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("name: "+rs.getString(1));
                System.out.println("surname: "+rs.getString(2));
                System.out.println("");
            }
//            for (String string : text) {
//                System.out.println(string);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
