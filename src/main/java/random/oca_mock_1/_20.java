package random.oca_mock_1;

public class _20 {
    public static void main(String[] args) {
        int x = 1;
        while (checkAndIncrement(x)) {
            System.out.println(x);
        }
    }

    private static boolean checkAndIncrement(int x) {
        if (x < 5) {
            x++;
            return true;
        } else {
            return false;
        }
    }
}

// This is an example of pass-by-value scheme. x of checkAndIncrement method contains the copy of variable x defined in main method.
// So, changes done to x in checkAndIncrement method are not reflected in the variable x of main. x of main remains 1 as code inside main is not changing its value.
// Every time checkAndIncrement method is invoked with argument value 1, so true is returned always and hence while loop executed indefinitely.