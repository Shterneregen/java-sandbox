package InjectList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class StarterConf {

//	@Autowired
	public InjectListBPP injectListBPP() {
		return new InjectListBPP();
	}
}
