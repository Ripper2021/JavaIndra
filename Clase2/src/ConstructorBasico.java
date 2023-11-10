public class ConstructorBasico 
{
	String nombre;
	
	public ConstructorBasico()
	{
		nombre = "Gustavo";
	}
	
	public static void main (String [] args)
	{
		ConstructorBasico persona = new ConstructorBasico();
		System.out.println("El nombre es: " + persona.nombre);
	}
	
}
