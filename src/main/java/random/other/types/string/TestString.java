package random.other.types.string;

public class TestString {

    public static void main(String[] args) {
        System.out.println(replace("================================================================"));
        System.out.println(replace("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ="));
    }

    private static String replace(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                chars[i] = ' ';
            }
        }
        return new String(chars);
    }
}
