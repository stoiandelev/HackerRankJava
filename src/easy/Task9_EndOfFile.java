package easy;

import java.util.Scanner;

public class Task9_EndOfFile {

    /**
     * Input Format
     * Read some unknown  lines of input from stdin(System.in) until you reach EOF;
     * each line of input contains a non-empty String.
     * Output Format
     * For each line, print the line number, followed by a single space,
     * and then the line content received as input.
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 1; scan.hasNext(); i++) {
            System.out.println(i + " " + scan.nextLine());
        }
    }
}
