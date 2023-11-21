package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import calculadora.Calculadora;
import configuracion.Configuracion;

public class Main 
{
	public static void main (String [] args) 
	{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
	Calculadora calculadora = context.getBean(Calculadora.class);
	int resultado1 = calculadora.sumar(10, 10);
	int resultado2 = calculadora.restar(10, 10);
	int resultado3 = calculadora.multiplicacion(10, 10);
	int resultado4 = calculadora.dividir(10, 10);
	System.out.println("El resultado de la suma es: " + resultado1);
	System.out.println("El resultado de la resta es: " + resultado2);
	System.out.println("El resultado de la multiplicacion es: " + resultado3);
	System.out.println("El resultado de la division es: " + resultado4);
	context.close();
	}
}