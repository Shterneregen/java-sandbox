package loggable.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

@Slf4j
@Component
@Aspect
//@EnableAspectJAutoProxy
public class LoggingAspect {

	@Pointcut("@annotation(loggable.annotatoins.Loggable)")
	public void executeLogging() {
	}

	@Before("executeLogging()")
	public void logMethodCall(JoinPoint joinPoint) {
		StringBuilder message = new StringBuilder("Before :: Method: ");
		message.append(joinPoint.getSignature().getName());
		Object[] args = joinPoint.getArgs();
		if (null != args && args.length > 0) {
			message.append(" args=[");
			Arrays.asList(args).forEach(arg -> {
				message.append("arg=").append(arg).append("|");
			});
		}
		log.info(message.toString());
	}

	@AfterReturning(pointcut = "executeLogging()", returning = "returnValue")
	public void logMethodCall(JoinPoint joinPoint, Object returnValue) {
		StringBuilder message = new StringBuilder("AfterReturning :: Method: ");
		message.append(joinPoint.getSignature().getName());
		Object[] args = joinPoint.getArgs();
		if (null != args && args.length > 0) {
			message.append(" args=[");
			Arrays.asList(args).forEach(arg -> {
				message.append("arg=").append(arg).append("|");
			});
		}
		if (returnValue instanceof Collection) {
			message.append(" | returning ").append(((Collection) returnValue).size()).append(" instance(s)");
		} else {
			message.append(" | returning ").append(returnValue.toString());
		}
		log.info(message.toString());
	}

	@Around("executeLogging()")
	public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object returnValue = joinPoint.proceed();
		long totalTime = System.currentTimeMillis() - startTime;
		StringBuilder message = new StringBuilder("Around :: Method: ");
		message.append(joinPoint.getSignature().getName());
		message.append(" totalTime: ").append(totalTime).append("ms ");
		Object[] args = joinPoint.getArgs();
		if (null != args && args.length > 0) {
			message.append(" args=[");
			Arrays.asList(args).forEach(arg -> {
				message.append("arg=").append(arg).append("|");
			});
		}
		if (returnValue instanceof Collection) {
			message.append(" | returning ").append(((Collection) returnValue).size()).append(" instance(s)");
		} else {
			message.append(" | returning ").append(returnValue.toString());
		}
		log.info(message.toString());
		return returnValue;
	}
}
