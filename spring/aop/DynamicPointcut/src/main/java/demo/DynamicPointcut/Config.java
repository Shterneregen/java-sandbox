package demo.DynamicPointcut;

import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public CustomPointcut customPointcut() {
		return new CustomPointcut();
	}

	@Bean
	public ExceptionHandlerInterceptor exceptionHandlerInterceptor() {
		return new ExceptionHandlerInterceptor();
	}

	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor() {
		return new DefaultPointcutAdvisor(customPointcut(), exceptionHandlerInterceptor());
	}
}
