package easy;

import java.util.Arrays;
import java.util.Scanner;

public class Task25_OneDimensionArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++)
            array[i] = scanner.nextInt();

        Arrays.stream(array).forEach(System.out::println);

    }
}

