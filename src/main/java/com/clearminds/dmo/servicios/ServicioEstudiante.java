package com.clearminds.dmo.servicios;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.clearminds.dmo.dtos.Estudiante;
import com.clearminds.dmo.excepciones.BDDException;
import com.clearminds.dmo.utils.DateUtils;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando estudiante: " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();
			
			String fechaActual = DateUtils.formatearFecha(new Date());
			String sql = "INSERT INTO estudiantes (nombre, apellido, edad, fecha_modificacion) " + "values('" + estudiante.getNombre() + "', '"
					+ estudiante.getApellido() + "', '"+ estudiante.getEdad() +"', '" + fechaActual + "')";

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
			
			String fechaActual = DateUtils.formatearFecha(new Date());
			String sql = "UPDATE estudiantes SET nombre='"+ estudiante.getNombre() + "', "
					+ "apellido='" + estudiante.getApellido() + "', edad=" + estudiante.getEdad() + ", "
							+ "fecha_modificacion='"+ fechaActual +"' WHERE id = " + estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}
