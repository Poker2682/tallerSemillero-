package com.clearminds.dmo.servicios;

import java.sql.SQLException;
import java.sql.Statement;

import com.clearminds.dmo.dtos.Estudiante;
import com.clearminds.dmo.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();

			String sql = "INSERT INTO estudiantes (nombre, apellido) " + "values('" + estudiante.getNombre() + "', '"
					+ estudiante.getApellido() + "')";

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Actualizando estudiante: " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();

			String sql = "UPDATE estudiantes SET nombre='"+ estudiante.getNombre() + "', "
					+ "apellido='" + estudiante.getApellido() + "' WHERE id = " + estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}
