package random.oca_mock_1._22;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Counter> original = new ArrayList<>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone();
        cloned.get(0).count = 5;

        System.out.println(original);

        // O_o
        System.out.println(original.get(0) == cloned.get(0));
        // but
        System.out.println(original == cloned);
    }
}

// Let's see what is happening during execution:
// main(String [] args) method goes on to the top of the STACK.
// 1. ArrayList<Counter> original = new ArrayList<>(); => It creates an ArrayList object [suppose at memory location 15EE00] and variable 'original' refers to it.
// 2. original.add(new Counter(10)); => It creates a Counter object [suppose at memory location 25AF06] and adds it as a first element of the ArrayList. This means element at 0th index of the ArrayList instance refers to Counter object at the memory location 25AF06.
// 3. ArrayList<Counter> cloned = (ArrayList<Counter>) original.clone(); => original.clone() creates a new array list object, [suppose at memory location 45BA12] and then it will copy the contents of the ArrayList object stored at [15EE00]. So, cloned contains memory address of the same Counter object.
// In this case, original != cloned, but original.get(0) == cloned.get(0). This means both the array lists are created at different memory location but refer to same Counter object.
// 4. cloned.get(0).count = 5; => cloned.get(0) returns the Counter object stored at the memory location 25AF06 and .count = 5 means change the value of count variable of the Counter object (stored at memory location 25AF06) to 5.
// 5. System.out.println(original); Prints the element of ArrayList original, which is: {25AF06} and toString() method prints: [Counter-5] as Counter object referred by [25AF06] is [Counter object (5)].