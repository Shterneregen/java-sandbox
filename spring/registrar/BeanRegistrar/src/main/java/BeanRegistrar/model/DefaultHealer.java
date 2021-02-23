package BeanRegistrar.model;

import org.springframework.stereotype.Component;

@Component
public class DefaultHealer implements Healer {

	@Override
	public void heal(Patient patient) {
		System.out.println("Само пройдёт");
	}

	@Override
	public String myType() {
		return "default";
	}
}
