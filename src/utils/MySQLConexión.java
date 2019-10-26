package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConexión {

	public static Connection getConexion() {
		Connection con = null;
		try {
			 //linea que nunca canbia ...
			Class.forName("com.mysql.jdbc.Driver");
			// igual hasta locaslhots: y el puertoo ponerlo siempre :3307 y el nombre
			// de la bd 
			String url = "jdbc:mysql://localhost/Examen_02"; 
			//usuario por defecto 
			String usr = "root";
			//clavee
			String psw = "mysql";
			//conectarse con la BD 
			con = DriverManager.getConnection(url, usr, psw);
		} catch (ClassNotFoundException ex) {
			System.out.println("Error >> Driver no Instalado!!");
		} catch (SQLException ex) {
			System.out.println("Error >> de conexión con la BD");
		}
		return con;
	}
	
	
	
}
