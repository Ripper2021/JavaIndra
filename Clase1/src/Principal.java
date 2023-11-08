import java.util.Scanner;
/*
Clases en Java: Las clases en Java son 
plantillas para la creación de objetos.
Dentro de una clase se definen los datos 
y el codigo que actua sobre los mismos. 
El codigo esta contenido dentro de 
lo que se conoce como METODOS. 
¿Que es un metodo? Un metodo es una 
accion especifica que puede hacer un programa. 

Vamos a definir en nuestros programas:
- Metodos: Acciones
- Objetos: Es un espécimen de una clase. Los objetos
 a menudo se utilizan para modelar objetos del mundo real.
- Variables:Nombre Apellido Edad Email, etc...
Ejemplo: 
Objeto Auto
Variables:
Marca
Color
Peso
...
Metodos:
Acelerar
Frenar
Encender
...
Clase publica: Son aquellas que pueden ser REUTILIZADAS
en otras clases y que por lo tanto, son accesibles desde distintas secciones del codigo. 
Clases privadas: Son aquellas que SOLO pueden utilizarse dentro del PAQUETE correspondiente al que esta contenido.
Clases finales: Son aquellas que designan el termino de una cadena de herencia. Es decir, se utilizan
para cerrar un conjunto de clases conectadas que generalmente son publicas.

¿Que es el Scanner en Java?
Es parte de la biblioteca estandar y se utiliza para LEER
Datos de entrada como texto, desde diferentes fuentes, 
como el teclado o archivos.
*/
public class Principal 
{
	public static void main (String [] args)
	{
		/*
		System.out.println("Hola Mundo!");
		System.err.println("Este es un error");
		System.out.print("Prueba");
		System.out.println("Bienivenido a mi calculadora, \npor favor elegir la operacion que deseas realizar\n"
				+ "1.Suma\n"
				+ "2.Resta\n"
				+ "3.Multiplicacion\n"
				+ "4.Division");
		System.out.println("Mi nombre es Gustavo" + " Y mi Apellido es Vargas");
		System.out.println(3 + 3);
		String nombre = "Gustavo";
		String apellido = "Vargas";
		int edad = 31;
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi apellido es: " + apellido);
		System.out.println("Mi edad es: " + edad);
		*/
		System.out.println("Ingrese su primer numero: ");
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		System.out.println("Ingrese su segundo numero: ");
		int numero2 = sc.nextInt();
		System.out.println("El primero numero es: " + numero1);
		System.out.println("El segundo numero es: " + numero2);
		int suma = numero1 + numero2;
		System.out.println("La suma de los dos numeros es " + suma);
		}
}