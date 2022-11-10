package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Task24_BigIntegerClass {

    /**
     * In this problem, you have to add and multiply huge numbers!
     * These numbers are so big that you can't contain them in any
     * ordinary data types like a long integer.
     * Use the power of Java's BigInteger class and solve this problem.
     * Input Format
     * There will be two lines containing two numbers, a and b .
     * Constraints
     *  and  are non-negative integers and can have maximum  digits.
     * Output Format
     * Output two lines. The first line should contain ,a + b
     * and "a x b" the second line should contain . Don't print any leading zeros.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());

        BigInteger firstResult = a.add(b);
        BigInteger secondResult = a.multiply(b);

        System.out.println(firstResult);
        System.out.println(secondResult);
    }
}
