package InjectList;

import InjectList.usage.Man;
import InjectList.usage.cars.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CheckInjectList {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CheckInjectList.class, args);

		Man man = context.getBean(Man.class);
		man.getCars().forEach(Car::ride);

		context.close();
	}

}
