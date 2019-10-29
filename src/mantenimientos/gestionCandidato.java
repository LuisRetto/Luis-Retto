package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import interfaces.candidatoInterfaces;
import model.candidato;
import utils.MySQLConexi�n;


public class gestionCandidato implements candidatoInterfaces  {

	public int Registrar(candidato c) {
		int rs =0;
		Connection con = null;
		
		PreparedStatement pa =null;
		System.out.println("TESTEAR 1.0");
		try {
			System.out.println("Entrando a mantenimiento 1.0");
			con=MySQLConexi�n.getConexion();
			String sql="update tb_candidato set	nomCandidato=?, apeCandidato=?, anioRegCandidato=?, partido=? where idCandidato=?;";
			pa=con.prepareStatement(sql);
			
			pa.setString(1,c.getNomCandidato());
			pa.setString(2,c.getApeCandidato());
			pa.setInt(3,c.getAnioRegCandidato());
			pa.setString(4,c.getPartido());
			pa.setInt(5,c.getIdCandidato());
			rs=pa.executeUpdate();
			System.out.println("Entrando a mantenimiento 5.0");
		} catch (Exception e) {
			System.out.println("Error en la sentencia: "+e.getMessage());
			// fuimos timados >:v

			
		}finally {
			try {
			
				if(pa !=null)
					pa.close();
				if(con !=null)
					con.close();
				
			} catch (Exception e2) {
				System.out.println("Erorr al cerra conexion.");
				
			}
		}
	
		
		return 0;
	}

}
