package com.mysqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DML_Commands {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrs","root","MR@#_Unique#@.RIDER");
		Statement st = con.createStatement();
		String s = "insert into dpt values (09,100,'SUNIL KUMAR PARIDA')";
		st.execute(s);
		con.close(); 
		System.out.println("Query executed .........");
	}

}
//https://github.com/MR-UNIQUE1/Com.tcs.ecommerce.git 