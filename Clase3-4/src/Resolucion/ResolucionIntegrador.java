/*
Ejercicio Integrador Numero 1:
En base a lo que ya has aprendido, se debe armar un programa. Nos contactaron desde el area de recursos humanos para ayudarlos con el desarrollo de un nuevo sistema.
El cual debe almacenar en el programa la siguiente información (pedida por consola) de los empleados:
- Nombre
- Apellido
- Edad
- Ciudad
- Puesto
- Salario Bruto
- Area
Esta información se debe almacenar y en base a la misma se deben hacer los siguientes calculos:
- Salario neto = Salario bruto * 0.80
Informar todos los campos en un fichero de salida que se llame "informacion_nomina.txt".
ESTRUCTURA DEL PROGRAMA:
- El programa debe implementar la clase Persona y ser utilizada para herencia. 
- El programa debe implementar el metodo calculoSalarioNeto dentro de una interfaz. 
- Hacer para al menos 3 empleados. 
ENTREGABLES:
- Codigo del proyecto. 
*/
package Resolucion;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Persona
{
	String nombre;
	String apellido;
	int edad;
	String ciudad;
	public Persona(String nombre, String apellido, int edad, String ciudad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudad = ciudad;
	}
}

interface iCalculos
{
	double salarioNeto(double salarioBruto);
}

public class ResolucionIntegrador extends Persona implements iCalculos
{
	String puesto;
	double salarioBruto;
	String area;
		
	public double salarioNeto(double salarioBruto) {
		return salarioBruto*0.80;
	}
	
	
	public ResolucionIntegrador(String nombre, String apellido, int edad, String ciudad, String puesto, double salarioBruto, String area)
	{
		super(nombre, apellido, edad, ciudad);
		this.puesto = puesto;
		this.salarioBruto = salarioBruto;
		this.area = area;
	}
	
	public static void main (String[] args)
	{
	
		Scanner scanner = new Scanner(System.in);
		ResolucionIntegrador[] empleados = new ResolucionIntegrador[3];
		
		for(int i = 0; i<3; i++)
		{
			System.out.println("Ingrese los datos para el empleado" + (i+1) + ": ");
			System.out.println("Nombre: ");
			String nombre = scanner.nextLine();
			System.out.println("Apellido: ");
			String apellido = scanner.nextLine();
			System.out.println("Edad: ");
			int edad = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Ciudad: ");
			String ciudad = scanner.nextLine();
			System.out.println("Puesto: ");
			String puesto = scanner.nextLine();
			System.out.println("Salario Bruto: ");
			double salarioBruto = scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Area: ");
			String area = scanner.nextLine();
			
			empleados[i] = new ResolucionIntegrador(nombre,apellido, edad, ciudad, puesto, salarioBruto, area);
		}
		
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter("informacion_nomina.txt"));
			
			for(int i=0; i<3; i++)
			{
				System.out.println("Información del empleado " + (i+1) + ": ");
				mostrarInformacionEmpleado(empleados[i]);
				writer.write("Información del empleado " + (i+1) + ":\n");
				escribirInformacionEmpleadoEnArchivo(empleados[i], writer);
			}
			writer.close();
			System.out.println("Se termino de escribir la informacion de los empleados");
		}
		catch(IOException e)
		{
			System.err.println("No se pudo escribir en el archivo");
			e.printStackTrace();
		}
		
		scanner.close();
	}
	
	public static void mostrarInformacionEmpleado(ResolucionIntegrador empleado)
	{
		System.out.println("Nombre: " + empleado.nombre);
		System.out.println("Apellido: " + empleado.apellido);
		System.out.println("Edad: " + empleado.edad);
		System.out.println("Ciudad: " + empleado.ciudad);
		System.out.println("Puesto: " +empleado.puesto);
		System.out.println("Salario bruto: " + empleado.salarioNeto(empleado.salarioBruto));
		System.out.println("Area: " + empleado.area);	
	}
	
	public static void escribirInformacionEmpleadoEnArchivo (ResolucionIntegrador empleado, BufferedWriter writer) throws IOException
	{
		writer.write("Nombre: " + empleado.nombre + "\n");
		writer.write("Apellido: " + empleado.apellido + "\n");
		writer.write("Edad: " + empleado.edad + "\n");
		writer.write("Ciudad: " + empleado.ciudad + "\n");
		writer.write("Puesto: " + empleado.puesto + "\n");
		writer.write("Salario Neto: " + empleado.salarioNeto(empleado.salarioBruto)+ "\n");
		writer.write("Area: " + empleado.area + "\n");
	}
}
