package random.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array2Stream {

	public static void main(String[] args) {
		String[] array = {"a1", "a2", "a3", "a4"};

		// Arrays.stream
		Stream<String> stream1 = Arrays.stream(array);
		stream1.forEach(System.out::println);

		// Stream.of
		Stream<String> stream2 = Stream.of(array);
		stream2.forEach(System.out::println);
	}
}
