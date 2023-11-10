/* Una interfaz es SIMILAR a una clase abstracta con todos sus metodos abstractos.
 * El objetivo de una interfaz es DECLARAR una serie de metodos sin su implementación. LUEGO, una o varias claes pueden implementar dicha interfaz.
 */

public class Perro implements iAcciones
{
	
	public void saludar()
	{
		System.out.println("Hola te estoy dando la patita");
	}
	public void correr()
	{
		System.out.println("Atrapame que me escapo!");
	}
	public void despedirse()
	{
		System.out.println("Chau me voy a mi casa");
	}
	public void moverElRabo()
	{
		System.out.println("Cheems");
	}
	
	public static void main (String [] args)
	{
	Perro perrito = new Perro();
	String apodo = "Lola";
	String raza = "No tiene";
	int edad = 2;
	int altura = 40;
	int peso = 16;
	perrito.saludar();
	perrito.correr();
	perrito.despedirse();
	perrito.moverElRabo();
	System.out.println("El apodo de mi perra es: " + apodo + " su raza es: " + raza + " y su edad es: " + edad + " y su peso es: " + peso + " y por ultimo la altura es: "+ altura);
	}
}
