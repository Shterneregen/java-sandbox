package loggable.services;

import loggable.annotatoins.Countable;
import loggable.annotatoins.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	@Value("${app.greeting}")
	private String greeting;

	public GreetingService(){
		super();
	}

	@Loggable
	@Countable
	public String getGreeting(String name){
		return greeting + " " + name;
	}
}
