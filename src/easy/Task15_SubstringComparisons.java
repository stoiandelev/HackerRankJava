package easy;

import java.util.Scanner;

public class Task15_SubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        int lengthSubstringToFind = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(string, lengthSubstringToFind));
    }

    public static String getSmallestAndLargest(String string, int lengthOfSubstringToFind) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be lexicographically(compareTo) the smallest substring of length 'lengthOfSubstringToFind'
        // 'largest' must be lexicographically the largest substring of length 'lengthOfSubstringToFind'

        // Generate sub-strings at length of 'lengthOfSubstringToFind', from given string 'string'.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i).length() >= lengthOfSubstringToFind) {
                sb.append(string.substring(i).substring(0, lengthOfSubstringToFind)).append(",");
            }
        }


        // Sorting the array of sub-strings generated lexicographically
        String[] arrayOfString = sb.toString().split(",");
        int n = arrayOfString.length;

        while (n > 0) {

            //we compare pair by pair and reorder the array with compareTo
            //after first reorder n-- from length and again
            for (int i = 0; i < arrayOfString.length - 1; i++) {
                if (arrayOfString[i].compareTo(arrayOfString[i + 1]) > 0) {
                    final String temp = arrayOfString[i + 1];
                    arrayOfString[i + 1] = arrayOfString[i];
                    arrayOfString[i] = temp;
                }
            }
            n--;
        }

        smallest = arrayOfString[0];
        largest = arrayOfString[arrayOfString.length - 1];
        return smallest + "\n" + largest;

    }

}
