package LegacyRegistrar;

import LegacyRegistrar.services.NewService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"LegacyRegistrar"})
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);

		NewService newService = ctx.getBean(NewService.class);
		newService.doWork();

		ctx.close();
	}
}
