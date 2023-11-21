import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean
	public MiBean miBean()
	{
		return new MiBean();
	}
	
	public static void main (String [] args)
	{
		AppConfig appConfig = new AppConfig();
		MiBean miBean = appConfig.miBean();
		miBean.saludar();
	}

}
