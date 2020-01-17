package random.other.types.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BigDecimalTest {
    public static void main(String[] args) {
        testDivider();
        tedScale();
    }

    private static void testDivider() {
        BigDecimal startCost = new BigDecimal("1005000");
        BigDecimal minCost = new BigDecimal("759750");
        BigDecimal lotStepDecreaseValue1 = new BigDecimal("24525");
        BigDecimal lotStepDecreaseValue2 = new BigDecimal("25125");
        checkStepDecreaseValue(startCost, minCost, lotStepDecreaseValue1);
        checkStepDecreaseValue(startCost, minCost, lotStepDecreaseValue2);
    }

    private static void checkStepDecreaseValue(BigDecimal startCost, BigDecimal minCost, BigDecimal lotStepDecreaseValue) {
        System.out.println("subtract: " + startCost.subtract(minCost));
        System.out.println("divide: " + startCost.subtract(minCost).divide(lotStepDecreaseValue, 2, RoundingMode.HALF_UP));

        BigDecimal[] divideAndRemainder = startCost.subtract(minCost).divideAndRemainder(lotStepDecreaseValue);
        System.out.println(String.format("divideAndRemainder: [0]: %s, [1]: %s", divideAndRemainder[0], divideAndRemainder[1]));
        System.out.println(divideAndRemainder[1].compareTo(BigDecimal.ZERO) == 0 ? "even" : "odd");
        System.out.println("=========================================================================================");
    }

    private static void tedScale() {
        double d = 34.4;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(d));
        System.out.println(df.format(Double.valueOf(d)));
        System.out.println(df.format(BigDecimal.valueOf(d)));

        final BigDecimal amountMin = BigDecimal.valueOf(d).setScale(2, RoundingMode.HALF_UP);
        System.out.println(amountMin);
    }
}
