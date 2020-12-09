package com.clearminds.dmo.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.dmo.bdd.ConexionBDD;
import com.clearminds.dmo.excepciones.BDDException;

public class ServicioBase {

	private Connection conexion;
	
	// Getters y Setters
	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	// Metodos
	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}
	
	public void cerrarConexion() {
		if(conexion != null) {
			try {
				conexion.close();
				System.out.println("Conexion Cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error al cerrar la conexions");
			}
		}
	}

}
