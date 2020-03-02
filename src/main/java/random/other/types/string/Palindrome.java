package random.other.types.string;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        boolean isPalindrome = A != null && new StringBuilder(A).reverse().toString().equals(A);
        System.out.println(isPalindrome ? "Yes" : "No");
    }

}