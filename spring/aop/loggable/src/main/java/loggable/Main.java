package loggable;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("loggable");
		ctx.refresh();

		SomeService someService = ctx.getBean(SomeService.class);
		String text = someService.test("world");
		System.out.println(text);

		ctx.close();
	}
}
