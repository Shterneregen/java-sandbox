package random.oca_mock_1;

public class _41 {
    public static void main(String[] args) {
        Double[] arr = new Double[2];
//        double[] arr = new double[2];
        System.out.println(arr[0] + arr[1]);
    }
}

// Array elements are initialized to their default values. arr is referring to an array of Double type, which is reference type and hence both the array elements are initialized to null.
// To calculate arr[0] + arr[1], java runtime converts the expression to arr[0].doubleValue() + arr[1].doubleValue(). As arr[0] and arr[1] are null hence calling doubleValue() method throws NullPointerException.