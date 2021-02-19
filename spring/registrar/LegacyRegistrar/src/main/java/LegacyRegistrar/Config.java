package LegacyRegistrar;

import LegacyRegistrar.services.DefaultNewService;
import LegacyRegistrar.services.NewService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(LegacyBeanDefinitionRegistrar.class)
public class Config {

	@Bean
	public NewService newService() {
		return new DefaultNewService();
	}
}
