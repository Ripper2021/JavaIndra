package Archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearFichero 
{
	public static void main (String [] args)
	{
		try {
		String contenido = "Este es mi contenido de prueba";
		String rutaYArchivo = "C:\\Users\\Gusta\\OneDrive\\Documentos\\prueba.txt";
		File archivo = new File(rutaYArchivo);
		archivo.createNewFile();
		System.out.println("Se creo el fichero");
		FileWriter fw = new FileWriter(archivo); //Estoy creando un objeto de la clase FileWriter
		//BufferedWriter depende del FileWriter
		BufferedWriter bw = new BufferedWriter (fw);
		bw.write(contenido);
		bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
