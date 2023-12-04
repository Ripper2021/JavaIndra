import java.util.Scanner;

//Creamos un JAR File.
/* JAR: Java Archive es un formato de archivo utilizado para
distribuir y almacenar colleciones de archivos Java, que pueden
incluir archivos de codigo fuente, archivos de clases, recursos
como imagenes, configuiraciones y metadatos.

CONTEXTO y REQUISITOS. 

¿Cuando usar un JAR file?
- Distribución de bibliotecas: Si vamos a crear una biblioteca
o un conjunto de claes reutilizables, usar un JAR file 
facilita la distribución. 
- Empaquetamiento de Recursos: Se pueden empaquetas codigo fuente,
clases, imagenes, archivos de configuración, etc... de manera simple.
- Librerías externas: Si tu proyecto tiene librerias externas asociadas
se puede empaquetar en un JAR file para que sea un archivo unico.
- Distribución de Aplicaciones Ejecutables: Podemos generar un JAR
file que contenga la clase Principal y manifestarlo de esta manera.

¿Cuando usar Archivos de Java Tradicionales?
- Proyectos pequeños o simples: En este tipo de proyectos
un JAR file es innecesario por la magnitud del mismo.
- Proyectos Web: Se utiliza como formaro de empaqueta
los archivos WAR (Web Application Archive).
- Proyectos con Estructura Especifica: - 
- Desarrollo y Pruebas Locales: Es mas conveniente trabajar
con archivos de Java tradicionales. 
*/
public class JAR 
{
		public static void main (String [] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa tu nombre: ");
			String nombre = sc.next();
			System.out.println("Bienvenid@" + " "+nombre + "\n"
					+ "Ingresa dos numeros para realizar operaciones aritmeticas");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int suma = a+b;
			int resta = a-b;
			int mult = a*b;
			int div = a/b;
			System.out.println("La suma es: " + suma+"\n"
							  +"La resta es: " + resta+"\n"
							  +"La multiplicacion es: " + mult+"\n"
							  +"La division es: " + div+"\n");			
		}
}