package random.other.types.string;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if (a == null || b == null) {
            return false;
        }
        return sortString(a).compareTo(sortString(b)) == 0;
    }

    private static String sortString(String str) {
        return java.util.stream.Stream.of(str.toLowerCase().split(""))
                .sorted()
                .collect(java.util.stream.Collectors.joining());
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}