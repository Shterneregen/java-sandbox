package loggable;

import loggable.services.OutputService;
import loggable.services.SomeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("loggable");
		ctx.refresh();

		// Loggable test
		SomeService someService = ctx.getBean(SomeService.class);
		String text = someService.test("world");
		System.out.println(text);

		// Countable test
		OutputService outputService = ctx.getBean(OutputService.class);

		for (int i = 0; i < 5; i++) {
			outputService.generateOutput();
			Thread.sleep(2000);
		}

		ctx.close();
	}
}
