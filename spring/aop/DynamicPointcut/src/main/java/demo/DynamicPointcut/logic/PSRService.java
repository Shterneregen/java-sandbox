package demo.DynamicPointcut.logic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PSRService {

	private final List<?> answer = Arrays.asList("true", "false", new Papaya());
	private int position;

	public boolean isPositive() {
		if (position == answer.size()) {
			position = 0;
		}
		System.out.println(position);

		String s = (String) answer.get(position++);
		System.out.println(s);
		return Boolean.parseBoolean(s);
	}
}
