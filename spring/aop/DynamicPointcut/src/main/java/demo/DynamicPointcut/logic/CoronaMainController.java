package demo.DynamicPointcut.logic;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalDateTime.now;

@RestController
@RequiredArgsConstructor
@RequestMapping("/corona/")
public class CoronaMainController {

	private final PSRService diagnosticService;

	@GetMapping("test")
	public PatientStatus getPatientStatus() {
		return new PatientStatus(diagnosticService.isPositive(), now());
	}
}
