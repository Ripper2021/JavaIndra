package Clase5Pac;
import java.util.Iterator;

import org.json.*;
/*
 * Maven: Es una herramienta de gestion de proyectos de Software de Java
 * y otros lenguajes de programacion. A traves de lo que se conoce como el archivo
 * POM esta en formato XML (Project Object Model) se encarga del manejo de dependencias en nuestro proyecto.
 * plugins, tareas de construcción, etc..
 * GroupID: Es el ID que identifica quien genero la dependencia/funcionalidad.
 * ArtefactID: Es el artefacto que contiene las funcionalidades asociadas.
 * GroupID: com.google.json;
 * ArtefactID: json-20231011;
 * JSON: Es un formato de texto sencillo para el intercambio de DATOS.
 */
public class Clase5 
{
	public static void main(String [] args)
	{
		JSONObject objeto = new JSONObject();
		objeto.put("Nombre", "Gustavo");
		objeto.put("Apellido", "Vargas");
		objeto.put("Edad", 31);
		objeto.put("Ciudad", "Barcelona");
		System.out.println(objeto);
		JSONArray arrayJson = new JSONArray();
		//Dentro de un JSONArray puedo insertar un JSONObject.
		arrayJson.put(objeto);
		System.out.println(arrayJson);
		//La clase Iterator es una interfaz que proporciona un medio para iterar sobre una colección de elementos, como una lista, un conjunto, un mapa, json. 
		//Permite recorrer los elementos de manera secuencial sin exponer los detalles internos de la estructura.
		/*
		Iterator<String> claves = objeto.keys();
		while (claves.hasNext())
		{
			String key = claves.next();
			System.out.println(key);
		}
		*/
		String stringJson = objeto.toString();
		System.out.println(stringJson);
		//Otra forma de declarar un JSON (en base a una cadena de caracteres)
		String cadenaCaracteres = "{\"nombre\":\"Gustavo\",\"apellido\":\"Vargas\",\"edad\":31}";
		JSONObject json_objecto = new JSONObject(cadenaCaracteres);
		System.out.println(json_objecto);
		String nombre = json_objecto.getString("nombre");
		int edad = json_objecto.getInt("edad");
		System.out.println("El nombre del usuario es: " +nombre + " y su edad es: " + edad);
		//Crear un JSON anidado
		JSONObject persona = new JSONObject();
		persona.put("nombre", "Patricia");
		persona.put("apellido", "");
		persona.put("edad", 23);
		persona.put("Correo electronico", "patricia@gmail.com");
		JSONObject direccion = new JSONObject();
		direccion.put("Calle", "Calle falsa");
		direccion.put("Ciudad", "Madrid");
		direccion.put("Pais", "España");
		persona.put("direccion", direccion);
		System.out.println("La informacion de la persona es: " + persona);
		//Obtengo la informacion del JSON anidado
		JSONObject direccionPersona = persona.getJSONObject("direccion");
		String calle = direccionPersona.getString("Calle");
		String ciudad = direccionPersona.getString("Ciudad");
		String pais = direccionPersona.getString("Pais");
		System.out.println("La calle es: " + calle + " la ciudad es: "+ ciudad + " el pais es: "  +pais);	
	}
}
