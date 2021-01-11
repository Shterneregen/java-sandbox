package random.other.types;

import java.util.Scanner;

public class TypeSizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (-128 <= x && x <= 127) System.out.println("* byte");
                if (-32_768 <= x && x <= 32_767) System.out.println("* short");
                if (-2_147_483_648 <= x && x <= 2_147_483_647) System.out.println("* int");
                if (-9_223_372_036_854_775_808L <= x && x <= 9_223_372_036_854_775_807L) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

}
// byte - 8 bits
// short - 16 bits
// int - 32 bits
// long - 64 bits
// float - 32 bits
// double - 64 bits
// boolean - 1 bit
// char - 16 bits