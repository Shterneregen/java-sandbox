package demo.DynamicPointcut.advice;

import demo.DynamicPointcut.logic.CoronaMainController;
import demo.DynamicPointcut.logic.PSRService;
import org.springframework.web.bind.annotation.RequestMapping;

@CoronaController
@RequestMapping("/corona/new/")
public class WrappedCoronaController extends CoronaMainController {
	public WrappedCoronaController(PSRService diagnosticService) {
		super(diagnosticService);
	}
}
