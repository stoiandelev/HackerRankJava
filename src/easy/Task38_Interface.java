package easy;

import java.util.Scanner;

public class Task38_Interface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        MyCalculator1 myCalculator = new MyCalculator1();

        System.out.println("I implemented: " + AdvancedArithmetic.class.getName());
        int sumForPrint = myCalculator.divisor_sum(number);
        System.out.println(sumForPrint);

    }

}

interface AdvancedArithmetic {

    int divisor_sum(int number);
}

class MyCalculator1 implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int number) {
        int sumDivisor = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sumDivisor += i;
            }
        }
        return sumDivisor;
    }
}
