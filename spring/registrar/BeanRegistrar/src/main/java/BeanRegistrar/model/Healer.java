package BeanRegistrar.model;

import org.springframework.beans.factory.annotation.Autowired;

public interface Healer {

	void heal(Patient patient);

	@Autowired
	default void regMe(Hospital hospital) {
		hospital.register(myType(), this);
	}

	String myType();

	String SPIRIT = "spirit";
}
