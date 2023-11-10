package Archivo;

import java.io.File;

public class BorrarDirectorio {

	public static void main(String [] args)
	{
		String directorio = "C:\\Users\\Gusta\\OneDrive\\Documentos\\Prueba";
		File directorioABOrrar = new File(directorio);
		
		if(directorioABOrrar.exists()) 
		{
			BorrarDirectorio(directorioABOrrar);
		}
		else
		{
			System.out.println("El directorio no existe");
		}
	}
	public static void BorrarDirectorio (File directory)
	
	{
		File[] files = directory.listFiles();
		if(files!= null)
		{
			for(File file: files)
			{
				System.out.println("Se borro el archivo: " + file);
				BorrarDirectorio(file);
			}
		}
		if (directory.exists())
		{
			if(directory.delete())
			{
				System.out.println("El directorio fue borrado");
			}
			else
			{
				System.out.println("No se pudo borrar el directorio");
			}
		}
	}
}
