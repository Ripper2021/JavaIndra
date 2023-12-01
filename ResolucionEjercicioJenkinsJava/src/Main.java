import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Dominio.Empleado;
import Dominio.Posicion;
import Dominio.Horario;

/*Ejercicios de Jenkins - Actividad ° 4:
Nos contrataron de "Doña Clotilde" que es una empresa de seguridad,ya que quieren generar un sistema de control de calidad de empleados. El mismo consiste en chequear
el horario de ingreso y de egreso de los empleados de la empresa. En base al puesto del empleado se contemplan distintas franjas horarias de acceso.

Posición: CEO
Horario estipulado de ingreso: 7am
Horario estipulado de egreso: 6pm

Posición: Jefe
Horario estipulado de ingreso: 8am
Horario estipulado de egreso: 6pm

Posición: Ingeniero
Horario estipulado de ingreso: 9am
Horario estipulado de egreso: 6pm

Posición: Analista
Horario estipulado de ingreso: 9am
Horario estipulado de egreso: 5pm

Posición: Scrum Master
Horario estipulado de ingreso: 9am
Horario estipulado de egreso: 6pm

Posición: RRHH
Horario estipulado de ingreso: 9am
Horario estipulado de egreso: 6pm

Si estas franjas horarias no se respetan, se generan infracciones salariales. Donde segun el puesto se descuenta un % del sueldo anual a cada empleado. 
Si Posicion = CEO Entonces se le descuenta 0.01
Si Posicion = Jefe Entonces se le descuenta 0.05
Si Posicion = Ingeniero Entonces se le descuenta 0.15
Si Posicion = Analista Entonces se le descuenta 0.20
Si Posicion = Scrum Master Entonces se le descuenta 0.10
Si Posicion = RRHH Entonces se le descuenta 0.09

El programa debe solicitar por consola los siguientes datos:
- Nombre
- Posicion
- Sueldo 
- Horario de Ingreso
En base a los datos ingresados se debe informar quien tiene una infracción. Hacer 1 para cada posición, como minimo.

SECCION JENKINS:
Generar un Jenkinsfile desde el programa de Java que informe cuales fueron los empleados y la posición qué ocupan en la empresa para mostrarlos por consola de Jenkins.
Para esto deben subir el proyecto a Github y escanear el Jenkinsfile. 

Entregable:
- Link del repositorio de Github
- Captura de pantalla de la consola de Jenkins. 
 */
public class Main 
{
	public static void main (String [] args)
	{
		final var empleados = new ArrayList<Empleado>();
		final var sc = new Scanner(System.in);
		for(int i=0; i< Posicion.values().length; i++)
		{
			System.out.println("Ingrese el nombre del empleado: ");
			final var nombre = sc.nextLine();
			System.out.println("Ingrese el salario del empleado: ");
			final var salario = Double.parseDouble(sc.nextLine());
			System.out.println("Ingrese la hora de ingreso del empleado: ");
			final var ingreso = Integer.parseInt(sc.nextLine());
			System.out.println("Ingrese la hora de regreso del empleado");
			final var regreso = Integer.parseInt(sc.nextLine());
			final var empleado = new Empleado(nombre, Posicion.values()[i], salario, new Horario(ingreso, regreso));
			empleado.calcularInfraccion();
			empleados.add(empleado);
		}
		try {
			final var bw = new BufferedWriter(new FileWriter("Jenkinsfile"));
		String formato_jenkinsfile = "pipeline {"+
									 "\nagent any" +
									 "\nstages {" +
									 "\nstage('Muestro informacion') {" +
									 "\nsteps {"+
									 "\necho 'La informacion de los empleados es:' "+empleados +
									 "\n}"+
									 "\n}"+
									 "\n}"+
									 "\n}";	
		bw.write(formato_jenkinsfile);
		System.out.println("Se genero el jenkinsfile");

		/*
		try {
			final var bw = new BufferedWriter(new FileWriter("Jenkinsfile"));
			bw.write("pipeline {");
			bw.write("\nagent any");
			bw.write("\nstages {");
			bw.write("\nstage('Muestro informacion') {");
			bw.write("\nsteps {");
			bw.write("\necho 'La informacion de los empleados es:' ");
			for (Empleado empleado:empleados)
			{
				bw.write("echo 'Empleado: " + empleado.getNombre() + "', \\"); 
				bw.write("echo 'Posicion: " + empleado.getPosicion() + "', \\"); 
				bw.write("echo 'Salario: " + empleado.getSalario() + "', \\"); 
				//bw.write("echo 'Infraccion: " + empleado.calcularInfraccion() + "', \\"); 
				//idem Posicion, salario, Infraccion...
			}
		*/
		}
		 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
