package BeanRegistrar.controller;

import BeanRegistrar.model.Hospital;
import BeanRegistrar.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/c")
@RestController
public class Controller {

	private final Hospital hospital;

	@PostMapping("treat")
	public Patient treat(@RequestBody Patient patient) {
		hospital.processPatient(patient);
		return patient;
	}
}
