package xml.configured.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.configured.spring.services.Quoter;

public class App {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		// To check MBeans
//		while (true) {
//			Thread.sleep(1000);
//			quoter.sayQuot();
//		}
	}
}
