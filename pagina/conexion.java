package pagina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.*;
import org.junit.runner.*;


@SuppressWarnings("unused")
public class conexion {
	
	private String dbUrl = "jdbc:mysql://127.0.0.1:3306/admin";
	 
	private String dbUser = "root";
	
	private String dbPassword = "";
	 
	private String jdbcName = "com.mysql.jdbc.Driver";
 
	 
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(jdbcName);
		} catch (Exception e) {
			 System.out.println ("¡Error al cargar el controlador!");
		}
		try {
			conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		} catch (SQLException ex) {
			 System.out.println ("¡Error al conectarse a la base de datos!");
		}
		return conn;
	}
 
	 // prueba
	public static void main(String[] args) {
		// System.out.println(new DBHelper().getConn());
		 System.out.println ("¡Conectado exitosamente a la base de datos!");
	}

	public void usuario(String usuario, String contra) {
		// TODO Auto-generated method stub
		
	}
 
}