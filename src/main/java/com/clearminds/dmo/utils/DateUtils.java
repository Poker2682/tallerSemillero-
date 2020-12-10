package com.clearminds.dmo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
public static final String FORMATO_COMPLETO = "yyyy-MM-dd HH:mm:ss";
	
	public static String formatearFecha(Date fecha) {
		
		SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_COMPLETO);
		String formato = formateador.format(fecha);
		return formato;
	}

}
