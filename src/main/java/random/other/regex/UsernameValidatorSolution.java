package random.other.regex;

import java.util.Scanner;

public class UsernameValidatorSolution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {
    public static final String regularExpression = "(^[a-zA-Z]{1})(\\w{7,29})";
}

// 8
// Julia -> Invalid +
// Samantha -> Valid +
// Samantha_21 -> Valid +
// 1Samantha -> Invalid -
// Samantha?10_2A -> Invalid +
// JuliaZ007 -> Valid +
// Julia@007 -> Invalid +
// _Julia007 -> Invalid -

// The username consists of to characters inclusive.
// If the username consists of less than or greater than characters, then it is an invalid username.

// The username can only contain alphanumeric characters and underscores (_).
// Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .

// The first character of the username must be an alphabetic character, i.e., either lowercase character or uppercase character .