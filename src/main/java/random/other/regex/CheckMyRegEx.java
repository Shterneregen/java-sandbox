package random.other.regex;

import java.util.Scanner;

public class CheckMyRegEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new IpRegex().pattern));
        }
    }

}

// Sample input
// 000.12.12.034
// 121.234.12.12
// 23.45.12.56
// 00.12.123.123123.123
// 122.23
// Hello.IP