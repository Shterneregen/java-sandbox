package InjectList.usage;

import InjectList.InjectList;
import InjectList.usage.cars.Car;
import InjectList.usage.cars.Mers;
import InjectList.usage.cars.Subaru;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Man {

	@PostConstruct
	public void init() {
		System.out.println("Man thinks about cars");
	}

	@InjectList(values = {Subaru.class, Mers.class})
	private List<Car> cars;

	public List<Car> getCars() {
		return cars;
	}
}
