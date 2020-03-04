package random.other.types.string;

import java.util.Scanner;

public class Splitter_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println(0);
        } else {
            s = s.trim().replaceAll("[\\W_]", " ").trim();
            if (s.isEmpty()) {
                System.out.println(0);
            } else {
                String[] split = s.split("\\s+");
                System.out.println(split.length);
                java.util.stream.Stream.of(split).forEach(System.out::println);
            }
        }

        scan.close();
    }

}