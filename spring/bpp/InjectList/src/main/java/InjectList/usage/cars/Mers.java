package InjectList.usage.cars;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Mers implements Car {

	@PostConstruct
	public void init() {
		System.out.println("Check Mers engine");
	}

	@Override
	public void ride() {
		System.out.println("Mers does rrrrrrrrrrrrrrrrr!");
	}
}
