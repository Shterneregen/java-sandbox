package random.oca_mock_1;

import java.util.ArrayList;
import java.util.List;

public class _34 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100);
        // but next is file
//        list.remove(new Integer(100));

        System.out.println(list);
    }
}