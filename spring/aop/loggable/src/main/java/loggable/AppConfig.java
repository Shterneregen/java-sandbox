package loggable;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
//@ComponentScan(basePackages = "loggable")
@EnableAspectJAutoProxy
public class AppConfig {
}
