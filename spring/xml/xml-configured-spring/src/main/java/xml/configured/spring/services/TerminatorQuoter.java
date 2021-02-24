package xml.configured.spring.services;

import xml.configured.spring.profiling.Profiling;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

	private String message;

	public TerminatorQuoter() {
		System.out.println("Phase 1");
	}

	@PostConstruct
	public void init() {
		System.out.println("Phase 2");
	}

	@Override
	public void sayQuot() {
		System.out.println("I'll be back!");
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
