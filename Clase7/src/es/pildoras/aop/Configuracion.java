package es.pildoras.aop;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration //Indica que es el archivo de configuración que tiene
			   // Que tener en cuenta AOP.
@ComponentScan("es.pildoras.aop") //Le indica a Java donde debe escanear para buscar la funcion principal a tener en cuenta.
@EnableAspectJAutoProxy //Habilita dentro de Spring los Aspectos. 
public class Configuracion {

}
