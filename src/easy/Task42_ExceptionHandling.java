package easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task42_ExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner value = new Scanner(System.in);

        try {
            int x = value.nextInt();
            int y = value.nextInt();
            int result = x / y;
            System.out.println(result);

        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}
