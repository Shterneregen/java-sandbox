package random.other.types;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestUnmodifiableSet {

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Set<String> set = new HashSet<>();
        set.add("test");
        System.out.println("set: " + set);

//        We cannot modify unmodifiableSet
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
//        unmodifiableSet.add("qwe"); // java.lang.UnsupportedOperationException will be thrown
        System.out.println("unmodifiableSet: " + unmodifiableSet);

//         We can pass this set to normal set to be able to change its items
        set = new HashSet<>(unmodifiableSet);
        set.add("test1");
        System.out.println("set: " + set);
    }
}
