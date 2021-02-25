package xml.configured.spring.bfpp;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
	Class newImpl();
}
