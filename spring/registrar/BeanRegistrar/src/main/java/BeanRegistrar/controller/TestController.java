package BeanRegistrar.controller;

import BeanRegistrar.model.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/test")
@RestController
public class TestController {

	@GetMapping
	public Patient test() {
		return Patient.builder().method("magic").build();
	}
}
