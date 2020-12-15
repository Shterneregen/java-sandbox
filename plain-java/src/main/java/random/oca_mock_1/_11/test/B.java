package random.oca_mock_1._11.test;

import random.oca_mock_1._11.A;

public class B extends A {
    public void print() {
        A obj = new A();
        System.out.println(obj.i1); //Line 8
//        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }

    public static void main(String[] args) {
        new B().print();
    }
}

// Variable i1 is declared public in class A, so Line 8 doesn't cause any compilation error.
// Variable i2 is declared protected so it can only be accessed in subclass using inheritance but not using object
// reference variable. obj.i2 causes compilation failure.