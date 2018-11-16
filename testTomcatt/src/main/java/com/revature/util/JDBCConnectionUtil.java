package com.revature.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionUtil {
	
	//JDBC - Java Database Connectivity
	public static Connection getConnection() throws SQLException
	{
		String url = "jdbc:oracle:thin:@cmrevdatabase.coczie8nigpj.us-east-2.rds.amazonaws.com:1521:ORCL";
		String user = "crystalM";
		String pass = "Aobooty2fine";
		return DriverManager.getConnection(url, user, pass);
	}

}
