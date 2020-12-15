package random.other.scanner;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        scan.skip("(\n|\r\n|[\n\r\u2028\u2029\u0085])?");
        int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
