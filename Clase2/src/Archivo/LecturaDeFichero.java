/* Scanner : Lectura de datos separados por delimitadores. 
 * Se puede utilizar para analizar y extraer datos de archivos pequeños.
 * Y se puede utilizar para leer tipos de datos primitivos
 * BufferedReader:
 * Lectura EFICIENTE de archivos GRANDES. Es eficiente ya que realiza la lectura en el bufer de memoria,
 * lo que minimiza la llamada al sistema operativo y reduce la sobrecarga de lectura.
 * Lectura de linea por linea lo cual indica que se encarga de leer toda la información de forma eficiente.
 * Lo hace a traves del metodo readLine()
 * FileReader:
 * Lectura de caracteres de forma INDIVIDUAL. Se utiliza para casos de lectura simples.
 * FileReader > Scanner > BufferedReader
 */


package Archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaDeFichero 
{
	public static void main (String [] args)
	{
		try
		{
		Scanner sc = new Scanner(new File("C:\\Users\\Gusta\\OneDrive\\Documentos\\prueba.txt"));
		while(sc.hasNextLine()) //Va a recorrer hasta que no tenga lineas que recorrer
		{
			System.out.println(sc.nextLine()); //Va a ir mostrando las lineas que encuentre.
		}
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		}
}
