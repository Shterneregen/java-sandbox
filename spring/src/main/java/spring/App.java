package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.beanpostprocessors.MyBean;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("spring");
		ctx.refresh();

		MyBean bean = ctx.getBean(MyBean.class);
		System.out.println(bean.getValue1());
		System.out.println(bean.getValue2());
		System.out.println(bean.getValue3());

		ctx.close();
	}
}
