package com.clearminds.dmo.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.clearminds.dmo.excepciones.BDDException;

public class ConexionBDD {
	
	public static String leerPropiedad(String nombre) {
		Properties p = new Properties();
		String path = "C:\\Users\\57300\\Documents\\Daniel\\CapacitacionCMC\\tallerSemillero-\\conexion.properties";
		try {
			p.load(new FileReader(path));
			return p.getProperty(nombre);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static Connection obtenerConexion() throws BDDException {
		String usuario = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		String url = leerPropiedad("urlConexion") + ";user="+ usuario +";password=" + password;
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}
		
		return conexion;
	}

}
