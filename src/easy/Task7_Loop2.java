package easy;

import java.util.Scanner;

public class Task7_Loop2 {

    /**
     * We use the integers , , and  to create the following series:
     * You are given  queries in the form of , , and . For each query,
     * print the series corresponding to the given , , and  values as a single line
     * of  space-separated integers.
     * Input Format
     * The first line contains an integer, , denoting the number of queries.
     * Each line  of the  subsequent lines contains three space-separated
     * integers describing the respective , , and  values for that query.
     * Constraints
     * Output Format
     * For each query, print the corresponding series on a new line. Each series
     * must be printed in order as a single line of  space-separated integers.
     * 2
     * 0 2 10
     * 5 3 5
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int c = a;

            for (int j = 0; j < n; j++) {
                c += Math.pow(2, j) * b;
                System.out.printf("%s ", c);
            }
            System.out.println();
        }
        scanner.close();

    }
}
