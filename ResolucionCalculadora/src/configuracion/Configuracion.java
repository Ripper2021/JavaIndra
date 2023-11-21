package configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import aspecto.LogginAspect;
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("calculadora, aspecto")

public class Configuracion {
	
	@Bean
	public LogginAspect timeLoggerAspect()
	{
		return new LogginAspect();
	}

}
