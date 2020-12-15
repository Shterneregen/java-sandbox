package random.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	enum Test {TEST1, TEST2, TEST3}

	public static void main(String[] args) {
		System.out.println(enumToStream());
		System.out.println(enumToStream2());
	}

	public static List<String> enumToStream() {
		return Stream.of(Test.values())
				.map(Test::name)
				.collect(Collectors.toList());
	}

	public static List<String> enumToStream2() {
		return Arrays.stream(Test.values())
				.map(Test::name)
				.collect(Collectors.toList());
	}
}
