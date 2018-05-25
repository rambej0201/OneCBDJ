package com.dss;

import java.sql.*;

public class TestDb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// load the type-1 driver
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		//step 2 provide the connection between java-database
		Connection con = DriverManager.getConnection("jdbc:odbc:ratan", "root", "R@ghu123");
		

	}

}
