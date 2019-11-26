package random.epm.$5;

public class A {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(100);
        Integer i2 = i1;
        System.out.println(i1 == i2); // true
        i1 -= 100;
        System.out.println(i1 + i2); // 100
    }
}
