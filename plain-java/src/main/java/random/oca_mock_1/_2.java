package random.oca_mock_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _2 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while (iterator.hasNext()) {
            String dryFruit = iterator.next();
            if (dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);
    }
}
