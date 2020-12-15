package random.other.regex;

import java.util.Scanner;

public class IpRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new IpRegexPattern().pattern));
        }
    }
}

class IpRegexPattern {
    // IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
    // Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

    private String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
}

// Sample input
// 000.12.12.034
// 121.234.12.12
// 23.45.12.56
// 00.12.123.123123.123
// 122.23
// Hello.IP