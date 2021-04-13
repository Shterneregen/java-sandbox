package loggable.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@Aspect
public class CountingAspect {

	private static final Map<String, Integer> countingMap = new HashMap();

	@Pointcut("@annotation(loggable.annotatoins.Countable)")
	public void executeCounting() {
	}

	@Before("executeCounting()")
	public void incrementCount(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getDeclaringType() + "." + joinPoint.getSignature().getName();
		if (countingMap.containsKey(methodName)) {
			int current = countingMap.get(methodName);
			current++;
			countingMap.put(methodName, current);
		} else {
			countingMap.put(methodName, 1);
		}
		StringBuilder message = new StringBuilder("Current counts are: | ");
		countingMap.forEach((k, v) -> message.append(k + "::" + v + " | "));
		log.info(message.toString());
	}
}
