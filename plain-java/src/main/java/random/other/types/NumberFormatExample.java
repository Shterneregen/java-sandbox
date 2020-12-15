package random.other.types;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat currencyUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyUS.format(payment);

        NumberFormat currencyIndia = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        dfs.setGroupingSeparator(',');
        dfs.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) currencyIndia).setDecimalFormatSymbols(dfs);
        String india = currencyIndia.format(payment);

        NumberFormat currencyChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyChina.format(payment);

        NumberFormat currencyFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}