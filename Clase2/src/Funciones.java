import java.util.Arrays;

public class Funciones
{
	/*
	public static void saludar()
	{
		System.out.println("Hola mundo!");
	}

	public static void main (String []args)
	{
		saludar();
	}

	
	public static int sumar(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String [] args)
	{
		int resultado = sumar(10, 10);
		System.out.println("El resutado de la suma es: " + resultado);
	}

	
	public static boolean esPrimo(int numero) //Declaro la funcion y le paso por parametro una variable
	{
		if (numero <= 1) //Verifico si el numero es menor o igual a 1, ya que los numeros menores o iguales a 1 no son primos.
		{
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) //Itera desde 2 hasta la raiz cuadrada del numero
		{
			
			//Verifica si el numero es divisible por algun valor en el rango.
			if(numero % i == 0)
			{
				//Si es divisible significa que no es primo y la función devuelve Falso
				return false;
			}
		}
		return true;
	}
	
	public static void main (String [] args)
	{
		int num = 11;
		if (esPrimo(num))
		{
			System.out.println(num + " Es un numero primo");
		}
		else
		{
			System.out.println(num + "No es un numero primo");
		}
	}
	
	public static long calcularFactorial(int n) 
	{
		if( n==0 || n==1)
		{
			return 1;
		}
		return n * calcularFactorial(n -1);
	}
	
	public static void main (String [] args)
	{
		int numero = 5;
		long factorial = calcularFactorial(numero);
		System.out.println("El factorial del numero es:" + numero + " es:" + factorial);
	}	
	public static void ordenarArray(int[] array)
	{
		Arrays.sort(array); //Se utiliza para ordenar arrays de forma ASCENDENTE.
							//Funciona para arrays de tipos primitivos como tambien para objetos.
							// La implementación de este metodos corre por detras un algoritmo de ordenación llamado Timsort.
							// Timsort es una variante hibrida de los algoritmos Merge Sort e Insertion Sort. 
	}
	public static void main (String [] args)
	{
		int[] numeros = {10,5,3,1,60,80,90,100,1000};
		System.out.println("Array por consola: " + numeros);
		System.out.println("Mostramos el array sin ordenar: " + Arrays.toString(numeros));
		ordenarArray(numeros);
		System.out.println("Array ordenado: " + Arrays.toString(numeros));
	}
		*/
}