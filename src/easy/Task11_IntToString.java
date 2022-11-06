package easy;

import java.util.Scanner;
import java.util.Set;

public class Task11_IntToString {

    /**
     * You are given an integer , you have to convert it into a string.
     * Please complete the partially completed code in the editor.
     * If your code successfully converts  into a string  the code will print "Good job".
     * Otherwise, it will print "Wrong answer".
     * can range between  to  inclusive.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        convert(num);
    }

    public static void convert(int n) {
        if (n >= -100 && n <= 100) {
            Integer.toString(n);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}

