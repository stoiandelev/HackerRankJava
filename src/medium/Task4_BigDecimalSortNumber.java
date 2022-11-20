package medium;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task4_BigDecimalSortNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberLength = scanner.nextInt();

        String[] inputString = new String[numberLength];
        for (int i = 0; i < numberLength; i++) {
            inputString[i] = scanner.next();
        }
        scanner.close();

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                BigDecimal a = new BigDecimal(String.valueOf(o1));
                BigDecimal b = new BigDecimal(String.valueOf(o2));
                return b.compareTo(a);
            }
        };

        Arrays.sort(inputString, 0, numberLength, comparator);


        for (int i = 0; i < numberLength; i++) {
            System.out.println(inputString[i]);
        }

    }
}


//9
//-100
//50
//0
//56.6
//90
//0.12
//.12
//02.34
//000.000