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

Herencia: Es un mecanismo mediante el cual una clase puede
HEREDAR atributos y metodos de otra clase. La clase que hereda
los atributos y metodos se conoce como "subclase" o "clase hija",
mientras que la clase que "presta" se conoce como "superclase" o "clase padre"

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique Su nombre");
		String nombre = sc.next();
		System.out.println("Ingrese su primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese su segundo numero: ");
		int numero2 = sc.nextInt();
		System.out.println("El primero numero es: " + numero1);
		System.out.println("El segundo numero es: " + numero2);
		int suma = numero1 + numero2;
		System.out.println("La suma de los dos numeros es " + suma);
		sc.close();

		//Resolucion 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = sc.nextInt();
		int suma = a+b;
		int resta = a-b;
		int multiplicacion = a*b;
		int division = a/b;
		System.out.println("La suma de los dos numeros es: "+suma);
		System.out.println("La resta  de los dos numeros es: "+resta );
		System.out.println("La multiplicacion de los dos numeros es: "+multiplicacion);
		System.out.println("La division de los dos numeros es: "+division);
	
		//Resolucion 2 (Con Menu)
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		int a = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		int b = sc.nextInt();
		
		System.out.println("Indique la operacion que desea realizar: \n"
				+ "1.Suma\n"
				+ "2.Resta\n"
				+ "3.Multiplicacion\n"
				+ "4.Division\n");
		int menu = sc.nextInt();
		if(menu==1)
		{
			int suma = a+b;
			System.out.println("La suma es: "+suma);
		}
		if(menu==2)
		{
			int resta = a-b;
			System.out.println("La resta es: "+ resta);
		}
		
		if (menu ==3)
		{
			int multiplicacion = a*b;
			System.out.println("La multiplicacion es: " + multiplicacion);
		}

		if(menu==4 && a != 0 && b !=0)
		{
			int division = a/b;
			System.out.println("La division es: " + division);
		}
		else
		{
			System.out.println("No podes dividir por 0");
		}
		*/	

public class Principal extends Empleado
{
	public Principal()
	{
		nombre = "Gustavo";
		apellido ="Vargas";
		edad = 31;
		altura=170;
		ciudad = "Barcelona";
		nomina = 1000;
		cargo ="Ingeniero";
	}
	public static void main (String [] args)
	{
		Principal informacion_empleado = new Principal();
		System.out.println("El nombre es :" + informacion_empleado.nombre);
		System.out.println("El apellido es :" + informacion_empleado.apellido);
		System.out.println("La edad es :" + informacion_empleado.edad);
		System.out.println("La altura es :" + informacion_empleado.altura);
		System.out.println("La ciudad es :" + informacion_empleado.ciudad);
		System.out.println("La nomina es :" + informacion_empleado.nomina);
		System.out.println("El cargo es :" + informacion_empleado.cargo);
	}
}
