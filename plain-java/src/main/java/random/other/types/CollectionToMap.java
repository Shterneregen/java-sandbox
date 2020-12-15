package random.other.types;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionToMap {

    public static void main(String[] args) {
        List<List<String>> data = Arrays.asList(
                Arrays.asList("1", "aaa", "A1", "2"),
                Arrays.asList("1", "aaa", "A0", "1"),
                Arrays.asList("1", "bbb", "A2", "5"),
                Arrays.asList("1", "bbb", "A1", "3"),
                Arrays.asList("1", "ccc", "A", "2")
        );
        Map<String, Integer> result = data.stream()
                .collect((Collectors.toMap(a -> a.get(1), a -> Integer.valueOf(a.get(3)), Integer::sum)));
        System.out.println(result);
    }

}