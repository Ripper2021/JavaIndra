package Clase4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/* Como declarar fechas, manejo de fechas, entre otras cosas.
 * 
 * 
 */
public class Fechas 
{
	public static void main(String[] args)
	{
		
	////////////////////////////////////
	// Libreria LocalDate/LocalDateTime
	////////////////////////////////////
	//Usamos LOcalDate / LocalDateTime
	LocalDateTime fecha_actual_hora = LocalDateTime.now();
	LocalDate fecha_actual = LocalDate.now();
	System.out.println("La fecha y hora actual es: " + fecha_actual_hora);
	System.out.println("La fecha actual es: " + fecha_actual);
	LocalDate fecha_nacimiento = LocalDate.of(1992, 5, 10);
	System.out.println("Mi nacimiento es: " + fecha_nacimiento);
	int edad = fecha_actual.getYear() - fecha_nacimiento.getYear();
	System.out.println("La edad del usuario es: " + edad);
	LocalDate fecha_hoy = LocalDate.now();
	LocalDate fecha_ayer = fecha_hoy.minusDays(1);
	LocalDate fecha_mañana = fecha_hoy.plusDays(1);
	System.out.println("La fecha de hoy es: " + fecha_hoy);
	System.out.println("La fecha de ayer fue: " + fecha_ayer);
	System.out.println("La fecha de mañana es: " + fecha_mañana);
	//Cambiar el formato de las fechas:
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY"); //Formatos validos: yyyy-MM-dd, dd/MM/YYYY, dd-MMM/YYYY, yyyy-MMM-dd HH:mm:ss
	String fechaFormateada = fecha_hoy.format(formatoFecha);
	System.out.println("La fecha formateada es: " + fechaFormateada);
	////////////////////////////////////
	//			Libreria Date
	////////////////////////////////////
	//Usamos la libreria de Date.
	Date fechaActual = new Date();
	System.out.println("Fecha actual con libreria Date: "+ fechaActual);
	SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
	String fechaFormateada1 = formato.format(fechaActual);
	System.out.println("La fecha formateada con libreria Date es: "+ fechaFormateada1);
	}	
}
