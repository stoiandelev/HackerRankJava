package easy;

import java.util.Scanner;

/**
 * Input Format
 * The first line contains a string . The second line contains another string .
 * The strings are comprised of only lowercase English letters.
 * Output Format
 * There are three lines of output:
 * For the first line, sum the lengths of  and .
 * For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
 * For the third line, capitalize the first letter in both  and print them on a
 * single line, separated by a space.
 */

public class Task13_StringIntroduction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        Integer sum = firstString.length() + secondString.length();
        System.out.println(sum);

        int result = firstString.compareTo(secondString);
        if (result > 0) {
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

        String capitalizeFirstWord = firstString.substring(0, 1).toUpperCase() + firstString.substring(1);
        String capitalizeSecondWord = secondString.substring(0, 1).toUpperCase() + secondString.substring(1);
        System.out.println(capitalizeFirstWord + " " + capitalizeSecondWord);

    }
}
