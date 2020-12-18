package spring.beanpostprocessors.injectrandomint;

import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyBean {

	@InjectRandomInt
	private int value1;

	@InjectRandomInt(min = 100, max = 200)
	private int value2;

	private int value3;

	@Override
	public String toString() {
		return "MyBean{" +
				"value1=" + value1 +
				", value2=" + value2 +
				", value3=" + value3 +
				'}';
	}
}
