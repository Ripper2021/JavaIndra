/*
THIS: Es una palabra clave que se utiliza dentro de una clase para referirse
a la instancia actual de esa clase. Su función principal es DIFERENCIAR entre los
atributos y metodos de la instancia actual y los parametros o variables locales con el mismo nombre.
*/

public class This 
{
	String nombre;
	//Distinguir atributos de Parametros
	public void establecerNombre (String nombre)
	{
		this.nombre = nombre;
	}

	public static void main(String [] args)
	{
		This ejemplo = new This();
		ejemplo.establecerNombre("Ejemplito");

		System.out.println("Nombre: " + ejemplo.nombre);
	}
}
