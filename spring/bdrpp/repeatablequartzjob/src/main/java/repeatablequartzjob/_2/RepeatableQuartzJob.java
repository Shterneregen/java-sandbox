package repeatablequartzjob._2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableQuartzJob {
	long repeatInterval();
}
