package random.epm.$9;

import java.util.Map;
import java.util.TreeMap;

public class A {
    // В таком виде при запуске будет исключение
    // java.lang.ClassCastException: com.sya.$9.Holder cannot be cast to java.lang.Comparable
    // необходимо, чтобы Holder реализовывал интерфейс Comparable с методом compareTo
    public static void main(String[] args) {
        Map<Holder, Integer> map = new TreeMap<>();
        Holder h1 = new Holder(1);
        Holder h2 = new Holder(2);
        map.put(h1, Integer.valueOf(11));
        map.put(h2, Integer.valueOf(22));

        for (Map.Entry<Holder, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey().hashCode());
        }

        h1.setH(2);
        System.out.println(map.get(h1));
        System.out.println(map.get(h2));
    }
}
