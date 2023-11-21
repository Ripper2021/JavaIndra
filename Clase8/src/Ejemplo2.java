import java.io.File;
import java.util.Scanner;

public class Ejemplo2 extends Thread 
{
	private String directorioAEliminar;
	
	public Ejemplo2(String directorioAEliminar)
	{
		this.directorioAEliminar = directorioAEliminar;
	}
	
	public void run()
	{
		File directorio = new File(directorioAEliminar);
		if (directorio.exists() && directorio.isDirectory())
		{
			borrarDirectorio(directorio);
		}
	}
	
	public void borrarDirectorio (File directorio)
	{
		File[] archivos = directorio.listFiles();
		if (archivos != null)
		{
			for (File archivo: archivos)
			{
				if(archivo.isDirectory())
				{
					borrarDirectorio(archivo);
				}
				else
				{
					archivo.delete();
				}
			}
		}
	}
	public static void main (String [] args)
	{
		System.out.println("Tarea en primer plano: iniciando la aplicación");
		String directorioAEliminar = "C:\\Users\\Gusta\\OneDrive\\Documentos\\Prueba";
		Ejemplo2 tareaABorrar = new Ejemplo2(directorioAEliminar);
		tareaABorrar.start();
		System.out.println("haciento tareas en primer plano, ingresa tu nombre.");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("Tu nombre es: " + nombre);
	}	
}
