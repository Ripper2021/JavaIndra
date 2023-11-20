package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class SaludoConAspecto 
{
	@Before("execution(public void saludar())") //ANTES de que se ejecute public void saludar()
	public void teSaludo()
	{
		System.out.println("Te estoy por saludar");
	}
	
	@After("execution (public void saludar())")
	public void sumar()
	{
		int a, b;
		a = 10;
		b = 10;
		int suma =a+b;
		System.out.println("La suma es: " + suma);
	}
}