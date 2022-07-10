package Usuarios;

import java.sql.*;

public class Conexion {

	final String JDBC_DRIVER;
	final String DB_URL;
	final String USER;
	final String PASS;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public Conexion() {
		
		JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
		DB_URL="jdbc:mysql://localhost:3306/supermercado";
		
		info f = new info();
		USER = f.getUser();
		PASS = f.getPass();
		
		conn = null;
		stmt = null;
		rs = null;
		
			
			//levanto el driver
			
			try {
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		
					// TODO Auto-generated catch block
		
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
