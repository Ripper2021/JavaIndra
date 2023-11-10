
public class Persona {
	String nombre;
	int edad;
	
	
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
	public Persona(String nombre, int edad)
	{
		this(nombre);
		this.edad = edad;
	}
	public static void main (String [] args)
	{
		Persona persona1 = new Persona("Gustavo");
		Persona persona2 = new Persona("Pablo", 23);
		System.out.println("Persona 1 - Nombre : " + persona1.nombre + ", Edad:" + persona1.edad);
		System.out.println("Persona 2 - Nombre : " + persona2.nombre + ", Edad:" + persona2.edad);
	}
}
