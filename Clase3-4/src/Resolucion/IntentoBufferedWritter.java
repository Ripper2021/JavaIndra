package Resolucion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IntentoBufferedWritter 
{
	
	public static void escribir (BufferedWriter writer, String contenido)
	{
		try {
		writer.write(contenido);
		System.out.println("Se esta escribiendo el contenido");
		}
		catch (IOException e)
		{
			System.err.println("No se pudo escribir el archivo");
			e.printStackTrace();
		}
	}
	
	public static void main (String [] args)
	{
		String nombreArchivo = "prueba.txt";
		String contenido = "Este es mi contenido de prueba";
		try
		{
		FileWriter fileWriter = new FileWriter(nombreArchivo);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
;		
		
		
	}
	
	
}
