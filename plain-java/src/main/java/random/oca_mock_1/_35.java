package random.oca_mock_1;

public class _35 {
    public static void main(String[] args) {
        String s1 = "OCAJP";
        String s2 = "OCAJP" + "";
        System.out.println(s1 == s2);

        // but
        String s3 = "OCAJP";
        String s4 = s3 + "";
        System.out.println(s3 == s4);
    }
}

// Please note that Strings computed by concatenation at compile time, will be referred by String Pool during execution.
// Compile time String concatenation happens when both of the operands are compile time constants,
// such as literal, final variable etc.
