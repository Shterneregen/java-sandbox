package demo.DynamicPointcut.advice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoronaWrapper {
	private Object result;
	private boolean corona;
}
