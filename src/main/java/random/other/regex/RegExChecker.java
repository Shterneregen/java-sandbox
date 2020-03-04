package random.other.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            testCases--;
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }

}
// Input
// 3
// ([A-Z])(.+)
// [AZ[a-z](a-z)
// batcatpat(nat