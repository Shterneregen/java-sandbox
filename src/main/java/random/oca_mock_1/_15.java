package random.oca_mock_1;

public class _15 {
    public static void main(String[] args) {
        int a = 100;
        System.out.println(-a++);
        System.out.println(a);
    }
}

// First add parenthesis (round brackets) to the given expression: -a++.
// There are 2 operators involved. unary minus and Postfix operator. Let's start with expression and value of a.
// -a++; [a = 100].
// -(a++); [a = 100] Postfix operator has got higher precedence than unary operator.
// -(100); [a = 101] Use the value of a (100) in the expression and after that increase the value of a to 101.
// -100; [a = 101] -100 is printed on to the console.