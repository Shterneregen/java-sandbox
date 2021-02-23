package demo.DynamicPointcut;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ExceptionHandlerInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			return invocation.proceed();
		} catch (Throwable ex) {
			System.out.println("================================================");
			System.out.println("Alert!!!");
			System.out.println("================================================");
			throw ex;
		}
	}
}
