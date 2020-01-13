package random.other.types.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
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
        System.out.println("even:" + (divideAndRemainder[1].compareTo(BigDecimal.ZERO) == 0));
        System.out.println("=========================================================================================");
    }
}
