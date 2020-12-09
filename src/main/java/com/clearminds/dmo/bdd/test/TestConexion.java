package com.clearminds.dmo.bdd.test;

import java.sql.Connection;

import com.clearminds.dmo.bdd.ConexionBDD;
import com.clearminds.dmo.excepciones.BDDException;

public class TestConexion {
	
	public static void main(String[] args) {
		try {
			
			Connection conexion = ConexionBDD.obtenerConexion();
			if(conexion != null) {
				System.out.println("Conexion exitosa");
			}
			
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
