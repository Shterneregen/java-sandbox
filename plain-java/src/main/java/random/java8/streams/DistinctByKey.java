package random.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * https://stackoverflow.com/questions/23699371/java-8-distinct-by-property
 * http://www.baeldung.com/java-streams-distinct-by
 */
public class DistinctByKey {

	public static void main(String[] args) {

		SomeObject o1 = new SomeObject("id1", "name1", "uid1");
		SomeObject o2 = new SomeObject("id2", "name1", "uid2");
		SomeObject o3 = new SomeObject("id3", "name2", "uid1");
		SomeObject o4 = new SomeObject("id4", "name1", "uid2");

		List<SomeObject> list = Arrays.asList(o1, o2, o3, o4);

		List<SomeObject> distinctSomeObjectsByName = list.stream()
				.filter(distinctByKey(SomeObject::getName))
				.collect(Collectors.toList());
		System.out.println(distinctSomeObjectsByName);

		List<SomeObject> distinctSomeObjectsByUid = list.stream()
				.filter(distinctByKey(SomeObject::getUid))
				.collect(Collectors.toList());
		System.out.println(distinctSomeObjectsByUid);
	}

	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}

//	not tested
//	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
//		Set<Object> seen = ConcurrentHashMap.newKeySet();
//		return t -> seen.add(keyExtractor.apply(t));
//	}

}

class SomeObject {
	private String id;
	private String name;
	private String uid;

	public SomeObject(String id, String name, String uid) {
		this.id = id;
		this.name = name;
		this.uid = uid;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getUid() {
		return uid;
	}

	@Override
	public String toString() {
		return "SomeObject{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", uid='" + uid + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SomeObject that = (SomeObject) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		return uid != null ? uid.equals(that.uid) : that.uid == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (uid != null ? uid.hashCode() : 0);
		return result;
	}
}
