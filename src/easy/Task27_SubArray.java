package easy;

import java.util.Scanner;

public class Task27_SubArray {

    /**
     * The sum of an array is the total sum of its elements.
     * An array's sum is negative if the total sum of its elements is negative.
     * An array's sum is positive if the total sum of its elements is positive.
     * Given an array of n integers, find and print its number of negative subarrays
     * on a new line.
     * The first line contains a single integer, n , denoting the length of array
     * Print the number of subArrays of A having negative sums.
     */

    /**
     * // used brute force to solve this because array size is small (capped at 100)
     * Подходът с груба сила е подход, който намира всички възможни решения,
     * за да намери задоволително решение на даден проблем.
     * Алгоритъмът за груба сила изпробва всички възможности,
     * докато не се намери задоволително решение.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //fill the array
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            int currentNumber = 0;
            for (int start = i; start < array.length; start++) {
                currentNumber += array[start];
                //check negative
                if (currentNumber < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
