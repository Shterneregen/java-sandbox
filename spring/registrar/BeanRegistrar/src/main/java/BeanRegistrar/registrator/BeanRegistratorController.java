package BeanRegistrar.registrator;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@RestController
public class BeanRegistratorController {

	@Autowired
	private AnnotationConfigWebApplicationContext context;

	@Autowired
	private CCL ccl;

	@SneakyThrows
	@PostMapping("/regbean")
	public String regBean(@RequestBody BeanMD beanMD) {
		Class<?> beanClass = ccl.findClass(beanMD.getBeanClassName());
		BeanDefinitionRegistry beanFactory = (BeanDefinitionRegistry) context.getBeanFactory();

		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setScope(SCOPE_SINGLETON);
		beanDefinition.setBeanClass(beanClass);
		beanFactory.registerBeanDefinition(beanMD.getBeanName(), beanDefinition);
		context.getBean(beanMD.getBeanName());

		return "registered";
	}
}
