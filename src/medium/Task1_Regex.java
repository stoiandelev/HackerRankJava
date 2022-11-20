package medium;

import java.util.Scanner;

/**
 * IP address is a string in the form "A.B.C.D",
 * where the value of A, B, C, and D may range from 0 to 255.
 * Leading zeros are allowed.
 * The length of A, B, C, or D can't be greater than 3.
 */

public class Task1_Regex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String IP = scanner.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public String pattern= "((([01]?[0-9]?[0-9])|(2[0-5]{2})|(2[0-4][0-9]))\\.){3}(([01]?[0-9]?[0-9])|(2[0-5]{2})|(2[0-4][0-9]))";
}


