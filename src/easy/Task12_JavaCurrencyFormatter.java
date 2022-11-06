package easy;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Given a double-precision number, , denoting an amount of money, use the NumberFormat class'
 * getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats.
 * Then print the formatted values as follows:
 * On the first line, print US: u where  is  formatted for US currency.
 * On the second line, print India: I was  formatted for Indian currency.
 * On the third line, print China: c where  is  formatted for Chinese currency.
 * On the fourth line, print France: f, where  is  formatted for French currency.
 */

public class Task12_JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //India: Rs.12,324.13 output in Java 8
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}




