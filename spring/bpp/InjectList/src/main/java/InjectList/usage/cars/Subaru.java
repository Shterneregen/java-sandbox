package InjectList.usage.cars;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Subaru implements Car {

	@PostConstruct
	public void init() {
		System.out.println("Check Subaru engine");
	}

	@Override
	public void ride() {
		System.out.println("Subaru does rrrr");
	}
}
