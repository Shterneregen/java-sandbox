package BeanRegistrar.model;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HospitalImpl implements Hospital{

	private Map<String, Healer> map = new HashMap<>();

	@Override
	public void register(String type, Healer healer) {
		map.put(type, healer);
	}

	@Override
	public void processPatient(Patient patient) {
		Healer healer = map.getOrDefault(patient.getMethod(), new DefaultHealer());
		healer.heal(patient);
	}
}
