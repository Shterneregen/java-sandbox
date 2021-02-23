package demo.DynamicPointcut;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class CustomPointcut extends DynamicMethodMatcherPointcut {

	private final String packagesToHandle = "demo.DynamicPointcut.logic";

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		return true;
	}

	@Override
	public ClassFilter getClassFilter() {
		return clazz -> clazz.getPackage().getName().contains(packagesToHandle);
	}
}
