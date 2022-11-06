package easy;

import java.util.Scanner;

public class Task17_PalindromeBoolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Convert the string to lowercase
        word = word.toLowerCase();
        boolean A = isPalindrome(word);
        System.out.println(A);
    }

    public static boolean isPalindrome(String string) {
        // Initializing an empty string to store the reverse of the original str
        StringBuilder reverseWord = new StringBuilder();

        // Initializing a new boolean variable for the answer
        boolean answer = false;

        for (int i = string.length() - 1; i >= 0; i--) {
            reverseWord.append(string.charAt(i));
        }

        // Checking if both the strings are equal
        if (string.equals(reverseWord.toString())) {
            answer = true;
        }
        return answer;
    }
}
