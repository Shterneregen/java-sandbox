package xml.configured.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.configured.spring.services.Quoter;

public class App {
	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

//		Uncomment to check BFPP
//		Quoter quoter = context.getBean(Quoter.class);
//		quoter.sayQuot();

//		 To check MBeans
//		 runInLoop(quoter);
	}

	private static void runInLoop(Quoter quoter) throws InterruptedException {
		while (true) {
			Thread.sleep(1000);
			quoter.sayQuot();
		}
	}
}
