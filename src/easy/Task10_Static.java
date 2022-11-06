package easy;

import java.util.Scanner;

public class Task10_Static {

    /**
     * Complete the given code so that it outputs the area of a parallelogram with breadth
     * and height . You should read the variables from the standard input.
     * If  or  , the output should be
     * "java.lang.Exception: Breadth and height must be positive" without quotes.
     * Input Format
     * There are two lines of input. The first line contains :
     * the breadth of the parallelogram. The next line contains : the height of the parallelogram.
     * Constraints
     * Output Format
     * If both values are greater than zero, then the main method must
     * output the area of the parallelogram. Otherwise, print "java.lang.Exception:
     * Breadth and height must be positive" without quotes.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        area(breadth, height);

    }

   public static void area(int breadth, int height) {
        if (breadth >= 0 && breadth < 100 && height >= 0 && height < 100) {
            int area = breadth * height;
            System.out.println(area);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

}
