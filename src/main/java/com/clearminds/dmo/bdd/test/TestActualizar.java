package com.clearminds.dmo.bdd.test;

import com.clearminds.dmo.dtos.Estudiante;
import com.clearminds.dmo.excepciones.BDDException;
import com.clearminds.dmo.servicios.ServicioEstudiante;

public class TestActualizar {
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {			
			srvEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja", 45, 1));			
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
