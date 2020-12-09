package com.clearminds.dmo.bdd.test;

import com.clearminds.dmo.dtos.Estudiante;
import com.clearminds.dmo.excepciones.BDDException;
import com.clearminds.dmo.servicios.ServicioEstudiante;

public class TestServicio {
	
	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {			
			srvEstudiante.insertarEstudiante(new Estudiante("Carlos", "Meza"));			
		} catch (BDDException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
