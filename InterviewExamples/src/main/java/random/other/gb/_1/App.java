package random.other.gb._1;

public class App {

    public static void main(String[] args) {
        Engine e = new Engine("e");
        Engine e1 = e;

//        Engine e = new Engine("e");
//        Engine e1 = new Engine("e1");
//        e = e1;
//        e1 = e;

        System.out.println(e);

        e = null;

        System.out.println(e);
        System.out.println(e1);

        System.out.println();
        System.gc();
    }

}
//    Which statement is true about this code?
//        It creates an object and the object is eligible for garbage collection.
//        It creates an object and the object is not eligible for garbage collection.
//        It creates two objects: e and e1. The e object is eligible for garbage collection.
//        It creates two objects and both the objects are ineligible for garbage collection.