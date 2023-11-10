/*ACTIVIDAD 3
Desarrollar un programa en Java que permita al usuario realizar las 4 operaciones aritmeticas basicas (suma, resta, division, multiplicación)
donde el usuario debe insertar 2 valores numericos por consola, y luego, se debe informar el resultado de las 4 operaciones.
CONSIDERACIONES:
El programa debe hacer lo siguiente:
- Crear un directorio donde se almacene el resultado de salida
- Ese directorio luego debe ser utilizado para almacenar el archivo de salida que contenga los resultados
- El archivo de salida se debe llamar "resultados"
EXTRA:
- Si la salida esta formateada. Por ejemplo:
El numero1 utilizado fue: 
El numero2 utilizado fue: 
El resutado de la suma es: resutado Suma
El resultado de la multiplicación es: 
ENTREGABLES:
- Codigo del proyecto. 
- TXT de salida.
 */
package Archivo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploTipoActividad 
{
	public static void main (String [] args)
	{
	Scanner sc = new Scanner (System.in);
	String directorio = "C:\\Users\\Gusta\\OneDrive\\Documentos\\ResolucionEj\\";
	String archivoSalida = "resultados.txt";
	String ruta_final = directorio + archivoSalida;
	File directorioFile = new File(directorio);
	boolean creado = directorioFile.mkdir();
	
	//Declaro las variables de calculo
	System.out.println("Ingrese el primer numero: ");
	int a = sc.nextInt();
	System.out.println("Ingrese el segundo numero: ");
	int b = sc.nextInt();
	int suma = a+b;
	int resta = a-b;
	int multiplicacion = a*b;
	int division = a/b;
	String Final = "El numero 1 utilizado es: " + a + "\n El numero 2 utilizado es: "+ b + "\nEl resutado de la suma es: " + suma + "\n ElResultado de la resta es: "+resta + "\n El resultado de la multiplicacion es: "+ multiplicacion + "\n El resultado de la division es: " +division;	
	File archivo = new File(ruta_final);
	try
	{
	FileWriter fw = new FileWriter(archivo);
	BufferedWriter bw = new BufferedWriter (fw);
	bw.write(Final);;
	//bw.write("El numero utilizado fue" + a + " el otro numero utilizado fue: " + b);
	bw.close();
	sc.close();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		System.exit(0);
	}
}