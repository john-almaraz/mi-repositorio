package training.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestJdbc {
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/cursojava";
	private static final String USUARIO = "root";
	private static final String CLAVE = "datasql";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Iniciando prueba de conexion BD");
        
  	
    		Connection conexion = null;
    		
    		try {
    			Class.forName(CONTROLADOR);
    			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
    			System.out.println("Conexi�n OK");

    		} catch (ClassNotFoundException e) {
    			System.out.println("Error al cargar el controlador");
    			e.printStackTrace();

    		} catch (SQLException e) {
    			System.out.println("Error en la conexi�n");
    			e.printStackTrace();
    		}
    		
    		
    	}
        
        
        
        
	

}




