package random.advanced_java_programming.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'q', 'w', 'e', 'r'};
    static Integer[] intArray = {1, 2, 3, 4};
    static Boolean[] boolArray = {true, false, true, false};

    public static List arrayToList(Object[] array) {
        List<Object> list = new ArrayList<>();
        for (Object o : array) {
            list.add(o);
        }
        return list;
//        return new ArrayList<>(Arrays.asList(array));
    }

    public static <T> List<T> arrayToListGeneric(T[] array) {
        List<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }

    public static void main(String[] args) {
        testSimpleArray();
        testGenericArray();
    }

    private static void testSimpleArray() {
        List<Character> charList = arrayToList(charArray);
        System.out.println(charList);
        List<Integer> intList = arrayToList(intArray);
        System.out.println(intList);
        List<Boolean> boolList = arrayToList(boolArray);
        System.out.println(boolList);

        List<String> boolList2 = arrayToList(boolArray);
        System.out.println(boolList2); // No Errors
        // System.out.println(boolList2.get(0)); // java.lang.ClassCastException: java.lang.Boolean cannot be cast to java.lang.String
    }

    private static void testGenericArray() {
        List<Character> charList = arrayToListGeneric(charArray);
        System.out.println(charList);
        List<Integer> intList = arrayToListGeneric(intArray);
        System.out.println(intList);
        List<Boolean> boolList = arrayToListGeneric(boolArray);
        System.out.println(boolList);

        // Compile time error
        // no instance(s) of type variable(s) exist so that Boolean conforms to String inference variable T has
        // incompatible bounds: equality constraints: String lower bounds: Boolean
//        List<String> boolList2 = arrayToListGeneric(boolArray);
    }
}
