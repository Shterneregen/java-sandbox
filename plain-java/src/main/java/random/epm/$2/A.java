package random.epm.$2;

public class A {
    public enum Size {BIG, SMALL}

    public static void main(String[] args) {
        System.out.println(Size.BIG);
        System.out.println(Size.BIG instanceof A.Size);
    }
}
