package random.oca_mock_1._10;

public class Test {
    public static void main(String[] args) {
        Super s = new Sub();
        try {
//            s.m1(); // Unhandled exception: java.io.IOException
        } /*catch (FileNotFoundException e) {
            System.out.print("M");
        }*/ finally {
            System.out.print("N");
        }
    }
}
