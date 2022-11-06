package easy;

import java.util.Scanner;

public class Task19_StringToken {

    /**
     * Given a string, , matching the regular expression [A-Za-z !,?._'@]+,
     * split the string into tokens. We define a token to be one or more consecutive
     * English alphabetic letters. Then, print the number of tokens, followed by each
     * token on a new line.
     * Output Format
     * <p></p>
     * On the first line, print an integer, , denoting the number of tokens in string
     * (they do not need to be unique). Next, print each of the  tokens on a new line in
     * the same order as they appear in input string .
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String stringByUser = scanner.nextLine();

        if (!stringByUser.trim().isEmpty()) {
            String[] splitString = stringByUser.trim().split("[ !,?._'@]+");

            System.out.println(splitString.length);

            for (String value : splitString) {
                System.out.println(value);
            }

        } else {
            System.out.println("0");
        }

    }
}
