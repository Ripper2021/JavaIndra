public class ConstructorConParametros {
String titulo;
String autor;
	
	public ConstructorConParametros(String titulo, String autor)
	{
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public static void main (String [] args)
	{
		ConstructorConParametros libro = new ConstructorConParametros("El Señor de los Anillos", "J.R.R Tolkien");
		System.out.println("Datos: " + libro.titulo + " " + libro.autor);
	}
}
