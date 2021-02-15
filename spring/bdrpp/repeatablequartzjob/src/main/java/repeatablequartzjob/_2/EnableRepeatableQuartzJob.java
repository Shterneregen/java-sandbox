package repeatablequartzjob._2;

import org.springframework.context.annotation.Import;
import spring.beandefinitionregistrypostprocessor._2.QuartzJobImportBeanDefinitionRegistrar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(QuartzJobImportBeanDefinitionRegistrar.class)
public @interface EnableRepeatableQuartzJob {

	String[] basePackages() default {};
}
