package random.java8.streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://dzone.com/articles/how-to-sort-a-map-by-value-in-java-8
 */
public class SortMap {

	public static void main(String[] args) {
		final Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("USA", 100);
		wordCounts.put("jobs", 200);
		wordCounts.put("software", 50);
		wordCounts.put("technology", 70);
		wordCounts.put("opportunity", 200);

		System.out.println(sortMapByValue(wordCounts));
		System.out.println(sortMapByKey(wordCounts));
	}

	private static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
		return map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

	private static LinkedHashMap<String, Integer> sortMapByKey(Map<String, Integer> map) {
		return map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}
}
