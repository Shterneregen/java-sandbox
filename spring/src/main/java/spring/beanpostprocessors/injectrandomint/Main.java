package spring.beanpostprocessors.injectrandomint;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"spring.beanpostprocessors.injectrandomint"})
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

		MyBean bean = ctx.getBean(MyBean.class);
		System.out.println(bean.getValue1());
		System.out.println(bean.getValue2());
		System.out.println(bean.getValue3());

		ctx.close();
	}
}
