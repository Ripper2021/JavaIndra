
public class ConstructorConConstructor {
	
	int longitud;
	int ancho;
	
	public ConstructorConConstructor (int longitud, int ancho)
	{
		this.longitud = longitud;
		this.ancho = ancho;
	}
	
	public ConstructorConConstructor (int longitud)
	{
		this(longitud, 1); 
	}
	
	public static void main (String [] args)
	{
		ConstructorConConstructor rectangulo = new ConstructorConConstructor(10);	
		System.out.println("La longitud es: " +rectangulo.longitud);
		System.out.println("El ancho es: " + rectangulo.ancho);
	}
}
