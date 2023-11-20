package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuracion.AspectConfig;
import funcion.Funcion;

public class Main {

	public static void main (String [] args)
	{
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(AspectConfig.class);
		Funcion funcion = contexto.getBean(Funcion.class);
		System.out.println("Resultado de la suma :" + funcion.sumar(100, 100));
		System.out.println("Resultado de la suma pesada es: " + funcion.sumar(2834290, 12391293));
		contexto.close();
	}
	
}
