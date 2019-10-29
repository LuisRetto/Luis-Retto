package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexión {

	public static Connection getConexion() {
		Connection con = null;
		try {
			System.out.println("Ingresando a base de datos");
			 //linea que nunca canbia ...
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Ingresando a base de datos 2.0");
			// igual hasta locaslhots: y el puertoo ponerlo siempre :3307 y el nombre
			// de la bd 
			String url = "jdbc:mysql://localhost:3307/examen_02"; 
			System.out.println("Test url");
			//usuario por defecto 
			String usr = "root";
			//clavee
			String psw = "mysql";
			//conectarse con la BD 
			con = DriverManager.getConnection(url, usr, psw);
			System.out.println("Ingresando a base de datos 3.0");
		} catch (ClassNotFoundException ex) {
			System.out.println("Error >> Driver no Instalado!! ");
		} catch (SQLException ex) {
			System.out.println("Error >> de conexión con la BD "+ex.getMessage());
		}
		return con;
	}
	
	
	
}
