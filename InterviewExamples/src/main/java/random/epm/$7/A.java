package random.epm.$7;

public class A {

    public static void main(String[] args) {
        func(5);
        func((byte) 5);
        func();
    }

    static void func(Object i) {
        System.out.println("Object = " + i);
    }

    static void func(Number i) {
        System.out.println("Number = " + i);
    }

    static void func(Byte l) {
        System.out.println("Byte = " + l);
    }

    static void func(byte... b) {
        System.out.println("byte = " + (b instanceof byte[]));
    }
}
