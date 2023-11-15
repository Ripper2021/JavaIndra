/*
 * Ejercicio 6 - Practica de JSON:
Generar un programa que le pida por consola al usuario información referida a sus alimentos favoritos. La misma debe ser la siguiente:
- Comida favorita
- Ingrediente 1
- Ingrediente 2
- Ingrediente 3
- Ingrediente 4
- Ingrediente 5
- Tiempo de cocción
- Bebida para acompañar. 

Luego, informar los valores por pantalla. Debe estar almacenado en un objeto de tipo JSON y se debe mostrar de dos maneras:
- El objeto de JSON como fue cargado
	- La información renglon por renglon:
	- Comida
	- Ingrediente 1
	- Ingrediente 2
	- Ingrediente 3
	- Ingrediente 4
	- Ingrediente 5
	- Tiempo de cocción
	- Bebida para acompañar
ENTREGABLE:
- Codigo del proyecto.
*/
package Clase5Pac;
import org.json.*;
import java.util.Scanner;
public class ResolucionEjercicio6 
{
	public static void main (String [] args)
	{		String comida;
	 		String ingrediente1;
	 		String ingrediente2;
	 		String ingredinte3;
	 		String ingrediente4;
	 		String ingrediente5;
	 		int tiempoCoccion;
	 		String bebidaAcompañar;
			Scanner sc = new Scanner(System.in);
			JSONObject alimentosFavoritos = new JSONObject();
            System.out.println("Introduce tus alimentos favoritos");
            System.out.println("Comida favorita: ");
            comida = sc.nextLine();
            System.out.println("Ingrediente 1:");
            ingrediente1 = sc.nextLine();
            System.out.println("Tiempo de coccion: ");
            tiempoCoccion = sc.nextInt();
            System.out.println("Bebida para acompaniar");
            bebidaAcompañar = sc.nextLine();
            
            alimentosFavoritos.put("Comida", comida);
            alimentosFavoritos.put("Ingrediente 1", ingrediente1);
            alimentosFavoritos.put("Tiempo de coccion", tiempoCoccion);
            alimentosFavoritos.put("Bebida para acomp", bebidaAcompañar);
            
            System.out.println("Json:");
            System.out.println(alimentosFavoritos);
            
	}
	
	
}
