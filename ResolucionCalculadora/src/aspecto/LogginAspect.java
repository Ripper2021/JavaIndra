package aspecto;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {	
	@Around("execution (* calculadora.Calculadora.*(..))")
	public Object logMetodCall(ProceedingJoinPoint joinPoint) throws Throwable
	{
		long startTime = System.currentTimeMillis();
		Object resultado = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución de la funcion: " + (endTime - startTime));
		return resultado;
	}
	@After("execution (* calculadora.Calculadora.*(..))")
	public void informo()
	{
		System.out.println("El metodo finalizo");
	}
}

/* execution(public int calculadora.Calculadora.sumar(int, int)):
   Cuando se ejecute el metodo sumar.

  execution (* paquete.Clase.metodoPublico()): apunta a CUALQUIER
  metodo publico en la clase "Clase" que no tenga parametros y no especifica el tipo de retorno
 
   execution(public void com.ejemplo.Clase.metodoVoid()): apunta a cualquier
   metodo en la clase 'Clase' que tenga cualquier numero de parametros de cualquier tipo.
  
   execution (* com.ejemplo.Clase.metodoConParametros(*)): apunta a cualquier
   metodo en la clase 'Clase' que tenga un solo parametro de cualquier tipo.
  
   execution(public * com.ejemplo.Clase.metodoQueDevuelvePublico()):
   Cualquier metodo publico en la clase 'Clase' que devuelve cualquier tipo.
   
   execution (* com.ejemplo.Clase.*()) apunta a cualquier metodo en la clase
   'Clase' que no tenga parametros y no especifica el tipo de retorno.
  
  execution (* calculadora.Calculadora.*(..)): Lo que indica el (..)
  es que matcheamos cualquier numero de parametros de cualquier tipo de parametro
  */
