
//Ejemplo donde retorno la instancia actual.
public class Ejemplo {
	private int numero; //Declaro una variable privada
	
	public Ejemplo(int numero) //Declaro el constructor de la clase
	{
		this.numero = numero; //Garantizo con el t his que el atributo se asigne correctamente
	}
	public Ejemplo duplicar() //Declaro un metodo que devuelve una INSTANCI de 'Ejemplo' con el atributo numero duplicado
	{
		return new Ejemplo(this.numero*2);
	}
	public static void main(String [] args)
	{
		Ejemplo ejemplo1 = new Ejemplo(5);
		Ejemplo ejemploDuplicado = ejemplo1.duplicar();
		System.out.println("Numero original: " +ejemplo1.numero);
		System.out.println("Numero duplicado: " + ejemploDuplicado.numero);
	}
}