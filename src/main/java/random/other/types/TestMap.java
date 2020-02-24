package random.other.types;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Set<String> set = new HashSet<>();
        set.add("test");
        System.out.println("set: " + set);

        Set<String> is =
                Collections.unmodifiableSet(set);

//        is.add("qwe"); // java.lang.UnsupportedOperationException will be throwed

        System.out.println("is: " + is);

        set = new HashSet<>(is);
        set.add("test1");

        System.out.println("set: " + set);
    }
}
