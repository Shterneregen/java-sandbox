package random.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Array2Map {

	public static void main(String[] args) {
		List<SomeObject> list = Arrays.asList(
				new SomeObject(1, "name1"),
				new SomeObject(2, "name2"),
				new SomeObject(3, "name3")
		);

		Map<Integer, SomeObject> map = list.stream().collect(Collectors.toMap(SomeObject::getId, Function.identity()));
		System.out.println(map);
	}


	static class SomeObject {
		private int id;
		private String name;

		public SomeObject(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "SomeObject{" +
					"id=" + id +
					", name='" + name + '\'' +
					'}';
		}
	}
}
