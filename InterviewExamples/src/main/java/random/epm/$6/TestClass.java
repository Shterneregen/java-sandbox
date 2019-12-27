package random.epm.$6;

import java.util.LinkedList;
import java.util.List;

public class TestClass {
    public static void doStaff1(List<Empty> list) {
    }

    public static void doStaff2(List list) {
    }

    public static void doStaff3(List<? extends Empty> list) {
    }

    public static void doStaff4(List<Extended> list) {
    }

    public static void main(String[] args) {
        List<Empty> list1 = new LinkedList<>();
        List<Extended> list2 = new LinkedList<>();

        doStaff1(list1);
        doStaff2(list2);
        doStaff2(list1);
        doStaff3(list1);
        doStaff3(list2);
//        doStaff1(list2); // incompatible types: java.util.List<random.epm.$6.Extended> cannot be converted to java.util.List<random.epm.$6.Empty>

//        doStaff4(list1);
        doStaff4(list2);
    }
}
