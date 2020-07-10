package random.advanced_java_programming.varargs;

public class Varargs {

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";

        String[] shopping = {"Bread", "Milk", "Eggs", "Bananas"};

        printShoppingList(item1, item2, item3);
        printShoppingList(shopping);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }

    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + ". " + items[i]);
        }
        System.out.println();
    }

//     'printShoppingList(String[])' is already defined in 'random.advanced_java_programming.varargs.Varargs'
//    private static void printShoppingList(String[] items) {
//        System.out.println("SHOPPING LIST");
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(i + ". " + items[i]);
//        }
//        System.out.println();
//    }

//    private static void printShoppingList(String item1, String item2) {
//        System.out.println("SHOPPING LIST");
//        System.out.println("1. " + item1);
//        System.out.println("2. " + item2);
//        System.out.println();
//    }
//
//    private static void printShoppingList(String item1, String item2, String item3) {
//        System.out.println("SHOPPING LIST");
//        System.out.println("1. " + item1);
//        System.out.println("2. " + item2);
//        System.out.println("3. " + item3);
//        System.out.println();
//    }
}
