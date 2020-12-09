package com.clearminds.dmo.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

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

}
