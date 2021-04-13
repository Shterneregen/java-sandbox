package loggable.services;

import loggable.annotatoins.Loggable;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

	@Loggable
	public String test(String text) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Hello " + text;
	}
}
