package Archivo;
import java.io.File;

public class CrearDirectorio 
{
	public static void main(String [] args)
	{
		
		String directorio = "C:\\Users\\Gusta\\OneDrive\\Documentos\\Prueba";
		File directorioACrear = new File(directorio);
		boolean creado = directorioACrear.mkdir(); //mkdir es un metodo que devuelve TRUE para la creación de un fichero y FALSE para cuando no se puede crear. 
		
		if(creado)
		{
			System.out.println("El directorio fue creado");
		}
		else
		{
			System.out.println("El directorio no fue creado");
		}
	}
	
	
	
}
