package random.epm.$8;

public class A {
    public static void main(String[] args) {
        new B() {
            String s = "A";

            {
                s = "D";
            }
        }.go();
    }
}
