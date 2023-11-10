interface Forma
{
	double calcularArea();
	double calcularPerimetro();
}

public class Circulo implements Forma{
	private double radio; //Declaro una variable PRIVADA llamada radio
	
	
	/* El constructor es propio del paradigma de Programación orientada a objetos
	 * Es un metodo ESPECIAL dentro de una clase que se llama AUTOMATICAMENTE cuando se crea una instancia
	 * (objeto) de esa clase. Su proposito principal es inicializar los atributos y realizar
	 * cualquier configuración necesaria para que el objeto pueda ser utilizado correctamente. 
	 * En Java el constructor SIEMPRE tiene el mismo nombre que la clase
	 */
	public Circulo(double radio) //Estoy DECLARANDO EL CONSTRUCTOR DE LA CLASE.
	{
		this.radio=radio; //This es el que se indica de GARANTIZAR la correcta asignación de la variable
	}
	
	public double calcularArea()
	{
		return Math.PI*radio*radio;
	}
	
	public double calcularPerimetro()
	{
		return 2 * Math.PI * radio;
	}
	
	public static void main (String [] args)
	{
		Circulo circulito = new Circulo(10);
		double area = circulito.calcularArea();
		double perimetro = circulito.calcularPerimetro();
		System.out.println("El area es: " + area);
		System.out.println("El perimetro es: " + perimetro );
	}
}
