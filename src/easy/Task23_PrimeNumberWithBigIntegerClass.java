package easy;

import java.math.BigInteger;
import java.util.Scanner;

public class Task23_PrimeNumberWithBigIntegerClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bi = new BigInteger(scanner.next());

        boolean result = bi.isProbablePrime(1);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}



