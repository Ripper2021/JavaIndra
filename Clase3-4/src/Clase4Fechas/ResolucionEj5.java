/*Ejercicio 5:
Trabajamos para una cadena de Supermecados y nos solicitaron que desarrollamos un nuevo sistema para sus productos. El mismo debe tener la capacidad de pedir por consola
los siguientes campos:
- Nombre del producto
- Precio
- Fecha de caducidad (Tipo de campo DATE) 
Para ello el programa debe poder realizar las siguientes acciones:
- Informar la cantidad de dias que falta para que el producto caduque. Fecha Actual - Fecha de Caducidad 
- Informar El precio con descuento. Precio - (Precio * 0.25)
Generar un fichero de salida con la información final, y, hacerlo para al menos 5 productos.
Entregables:
- Codigo del proyecto. 
 */

package Clase4Fechas;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ResolucionEj5 
{
	String nombreProducto;
	double precio;
	LocalDate fecha_actual = LocalDate.now();
	Date fechaCaducidad;
	
	public ResolucionEj5(String nombreProducto, double precio, Date fechaCaducidad)
	{
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.fechaCaducidad= fechaCaducidad;
	}
	
	public int diasParaCaducar()
	{
		Date fecha_actual = new Date();
		long tiempoRestante = fechaCaducidad.getTime() - fecha_actual.getTime();
		return (int) (tiempoRestante / (1000 * 60 * 60 * 24));
	}
	
	public double precioConDescuento()
	{
		return precio - (precio * 0.25);
	}
	
	public String toString()
	{
		return "Nombre: " + nombreProducto + "\nPrecio: $" + precio + "\nDias para caducar: "+ diasParaCaducar()
				+ "\nPrecio con descuento: $" + precioConDescuento();
	}
	
	public static void main (String [] args)
	{
			Scanner sc = new Scanner (System.in);
			ResolucionEj5[] productos = new ResolucionEj5[5];
			
			for (int i = 0; i<productos.length; i++)
			{
				System.out.println("Ingrese información del producto" + (i +1));
				String nombreProducto = sc.nextLine();
				
				System.out.println("Precio del producto: ");
				double precio = sc.nextDouble();
				
				sc.nextLine();
				
				System.out.print("Fecha de caducidad (Formato: dd-MM-yyyy): ");
				String fechaCaducidadStr = sc.nextLine();
				Date fechaCaducidad = parseFecha(fechaCaducidadStr);
				productos[i] = new ResolucionEj5(nombreProducto, precio, fechaCaducidad);
			}
	generarFichero(productos);
	sc.close();
	}
	
	private static Date parseFecha(String fechaStr)
	{
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
		try
		{
			return formatoFecha.parse(fechaStr);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	private static void generarFichero(ResolucionEj5[] productos)
	{
		try
		{
			FileWriter escritor = new FileWriter("productos.txt");
			for(ResolucionEj5 producto: productos)
			{
				escritor.write(producto.toString() + "\n\n");
			}
			System.out.println("Fichero generado exitosamente");
		escritor.close();	
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}