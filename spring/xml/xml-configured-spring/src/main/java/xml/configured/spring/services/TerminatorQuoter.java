package xml.configured.spring.services;

import xml.configured.spring.postproxy.PostProxy;
import xml.configured.spring.profiling.Profiling;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

	private String message;

	public TerminatorQuoter() {
		System.out.println("Phase 1. Constructor");
	}

	@PostConstruct
	public void init() {
		System.out.println("Phase 2. @PostConstruct");
	}

	@Override
	@PostProxy
	public void sayQuot() {
		System.out.println("Phase 3. @PostProxy");
		System.out.println("I'll be back!");
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
