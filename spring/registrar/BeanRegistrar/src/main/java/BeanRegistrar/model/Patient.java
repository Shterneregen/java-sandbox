package BeanRegistrar.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {

	private String method;

	public String getMethod() {
		return method;
	}
}
