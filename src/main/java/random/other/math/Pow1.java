package random.other.math;

import java.util.Scanner;

public class Pow1 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int res = a;
            for (int ii = 0; ii < n; ii++) {
                int c = (int) Math.pow(2, ii);
                res += c * b;
                System.out.print(res);
                System.out.print(" ");
            }
        }
        in.close();
    }
}
