package BeanRegistrar.model;

import org.springframework.stereotype.Component;

@Component
public class Shaman implements Healer {

	@Override
	public void heal(Patient patient) {
		System.out.println("Бей в бубен");
	}

	@Override
	public String myType() {
		return Healer.SPIRIT;
	}
}
