package com.sj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreStDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schemaone","root","Hrittika1234@");
        PreparedStatement pst = connection.prepareStatement("insert into user values(?,?,?)");
        pst.setInt(1, 5);
        pst.setString(2 , "aaa");
        pst.setString(3, "aaa");
        
        int rows = pst.executeUpdate();
        
        if(rows==1)
        
        	System.out.println("data inserted successfully");
        	else
        	
        		System.out.println("something went wrong");
        	
        }

	}

