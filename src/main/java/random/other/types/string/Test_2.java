package random.other.types.string;

import java.util.Scanner;

public class Test_2 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        for (int i = 0; i < s.length() - k + 1; i++) {
            int end = Math.min(i + k, s.length());
            String sub = s.substring(i, end);
            if (smallest.equals("")) {
                smallest = sub;
            }
            if (smallest.compareTo(sub) > 0) {
                smallest = sub;
            }
            if (largest.compareTo(sub) < 0) {
                largest = sub;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}