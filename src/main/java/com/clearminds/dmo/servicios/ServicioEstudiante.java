package com.clearminds.dmo.servicios;

import com.clearminds.dmo.dtos.Estudiante;
import com.clearminds.dmo.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		cerrarConexion();
	}
	
}
