package es.pildoras.aop.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.ClienteDAO;
import es.pildoras.aop.Configuracion;

public class main 
{
	public static void main (String[] args)
	{
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		elCliente.saludar();
		contexto.close();
	}
}