package random.epm.$1;

import java.io.IOException;

public class $1 {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.func(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        B b = new B();
        b.func(1);

        A a1 = new B();
//        B b1 = new A();
    }
}
