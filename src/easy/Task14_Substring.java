package easy;

import java.util.Scanner;

public class Task14_Substring {

    /**
     * Input Format
     * The first line contains a single string denoting .
     * The second line contains two space-separated integers denoting the respective values of  and .
     * Constraints
     * String  consists of English alphabetic letters (i.e., ) only.
     * Output Format
     * Print the substring in the inclusive range from  to .
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String substring = string.substring(start, end);
        System.out.println(substring);

    }
}
