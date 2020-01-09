package random.oca_mock_1;

public class _24 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = sb.toString();

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

// toString() method defined in StringBuilder class doesn't use String literal rather uses the constructor of String class to create the instance of String class.
// So both s1 and s2 refer to different String instances even though their contents are same. s1 == s2 returns false