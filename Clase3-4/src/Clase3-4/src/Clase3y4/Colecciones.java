package Clase3y4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Colecciones: Un conjunto de objetos/elementos Que se encargan de permitirnos manejar y manipular los datos.
 * Tipos de colecciones: 
 * - Set
 * - List
 * - Map
 * 
 * Lista: Es una estructura de datos que puede contener una serie de elementos en una secuencia ORDENADA.  
  Muestra los elementos acorde a su inserción dentro de la lista. 
  Admite elementos duplicados tambien.
  
  Set: Es una interfaz que extiende de la coleción de Colecctions que se utiliza
  para representar valores UNICOS. 
 */

class MiClase
{
	private String valores;
	
	public MiClase(String valores)
	{
		this.valores= valores;
	}
	
	public String getValor()
	{
		return valores;
	}
}

public class Colecciones 
{
		public static void main (String[] args)
		{
			List<String> nombre = new ArrayList<String>();
			nombre.add("Patricia");
			nombre.add("Gustavo");
			nombre.add("Pablo");
			nombre.add("Patricia");
			nombre.add("Carlos");
			nombre.add("Emilio");
			System.out.println(nombre);
			int tamanio = nombre.size();
			System.out.println("La lista tiene esta cantidad de elementos: " + tamanio);
			String nombre_pos2 = nombre.get(2); //Como obtener un elemento de una posición
			System.out.println("El elemento en la posición 2 es: "+ nombre_pos2);
		    nombre.remove(3);
		    System.out.println("Los nombres actualizados son: " + nombre);
		    //Actualizar el nombre de un elemento de la lista
		    nombre.set(1, "Ariel");
		    System.out.println("Nombres actualizados: "+nombre);
		    boolean contiene = nombre.contains("Emilio");
		    System.out.println("La lista de nombres contiene a Emilio?" + contiene);
		    //Eliminar TODOS los elementos de la lista
		    nombre.clear();
		    System.out.println("La lista esta vacia: " + nombre);
		    //Lista con vario tipos de datos.
		    List<Integer> listaDeEnteros = new ArrayList<>();
		    listaDeEnteros.add(1);
		    listaDeEnteros.add(2);
		    listaDeEnteros.add(3);
		    List<String> colores = new ArrayList<>();
		    colores.add("Rojo");
		    colores.add("Azul");
		    colores.add("Amarillo");
		    List<Object> objetoLista = new ArrayList<>();
		    objetoLista.add(listaDeEnteros);
		    objetoLista.add(colores);
		    System.out.println("Mi lista concatenada es: " + objetoLista);
		    Object posicion_1 = objetoLista.get(1);
		    System.out.println("El objeto de la posicion 1 es: " + posicion_1);
		    //For para recorrer una lista.
		    for(int i = 0; i < listaDeEnteros.size(); i++)
		    {
		    	int numero = listaDeEnteros.get(i);
		    	System.out.println("Elemento en la posición " + i + ": " + numero);
		    }
		    //Foreach
		    for (int numero: listaDeEnteros)
		    {
		    	System.out.println("Recorro la lista con un foreach: " + numero);
		    }
		    //////////////////////////////////////////////////
		    //						SET
		    //////////////////////////////////////////////////
		    Set<String> lenguajesDeProgramacion = new HashSet<String>();
		    lenguajesDeProgramacion.add("Python");
		    lenguajesDeProgramacion.add("Python");
		    lenguajesDeProgramacion.add("GO");
		    lenguajesDeProgramacion.add("C#");
		    lenguajesDeProgramacion.add("C#");
		    lenguajesDeProgramacion.add("C++");
		    lenguajesDeProgramacion.add("SQL");
		    lenguajesDeProgramacion.add("SQL");
		    lenguajesDeProgramacion.add("Java");
		    lenguajesDeProgramacion.add("COBOL");
		    lenguajesDeProgramacion.add("Visual Basic");
		    lenguajesDeProgramacion.add("Javascript");
		    System.out.println("La lista de lenguajes de programación es: " + lenguajesDeProgramacion);
		    //Remuevo
		    lenguajesDeProgramacion.remove("GO"); 
		    //Tamano del conjunto
		    int tamanio_set = lenguajesDeProgramacion.size();
		    System.out.println("El tamaño es: " + tamanio_set);
		    Set<Integer> numeros_set = new HashSet<Integer>();
		    numeros_set.add(1);
		    numeros_set.add(2);
		    numeros_set.add(3);
		    Set<Object> objeto = new HashSet<>();
		    objeto.add(lenguajesDeProgramacion);
		    objeto.add(numeros_set);
		    System.out.println("Los elementos del objeto son: " + objeto);
		    /* Cuando usar SET:
		     * Necesitamos almacenar elementos unicos
		     * No nos interesa el orden que tengan
		     * No nos preocupa el rendimiento del programa.
		     * Cuando usar Lista:
		     * Necesitamos almacenar elementos duplicados
		     * Necesitamos almacenar elementos en el orden que vienen ingresados.
		     */
		    //////////////////////////////////////////////////
		    //						Maps
		    //////////////////////////////////////////////////
		    /* En Java es una estructura de datos que se utiliza para
		     * almacenar una colección de pares clave-valor. Cada elemento
		     * contiene dos partes: Una clave unica que se utiliza para identificar
		     * el valor asociado, y, el valor de dicha clave.
		     * HashMap: Es una implementación de Map que utiliza una tabla HASH
		     * Para almacenar sus elementos. Es una de las implementaciones mas eficientes,
		     * PERO no garantiza el orden de los elementos.
		     */
		    HashMap<String, Integer> usuarios = new HashMap<>();
		    usuarios.put("Gustavo", 31);
		    usuarios.put("Patricia", 23);
		    usuarios.put("Alejandro", 25);
		    System.out.println(usuarios);
		    //Obtengo la edad de alguno de los usuario
		    int edadPatricia = usuarios.get("Patricia");
		    System.out.println("La edad de Patricia es : " + edadPatricia);
		    //Modificar un elemento
		    usuarios.put("Gustavo", 50);
		    System.out.println("Los usuarios son: " + usuarios);
		    //Obtengo las claves. 
		    try {
				Set<String> claves = usuarios.keySet(); //El metodo keySet va a buscar las claves y las almacena.
				System.out.println("Las claves son: ");
				//Recorro las claves con un foreach.
				for (String clave: claves)
				{
					System.out.println(clave);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    //Remuevo un elemento.
		    usuarios.remove("Gustavo");
		    MiClase clave1 = new MiClase("Objeto1");
		    MiClase clave2 = new MiClase("Objeto2");
		    HashMap<MiClase, String> prueba= new HashMap<>();
		    prueba.put(clave1, "Valor1");
		    prueba.put(clave2, "valor2");
		    System.out.println("Prueba de Objeto-String: " + prueba);
		    System.out.println("Valor para clave1: " + prueba.get(clave1));
		    System.out.println("Valor para clave2: " + prueba.get(clave2));
		}
}
