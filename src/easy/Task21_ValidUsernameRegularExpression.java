package easy;

import java.util.Scanner;

public class Task21_ValidUsernameRegularExpression {

    /**
     * You are updating the username policy on your company's internal networking platform.
     * According to the policy, a username is considered valid if all the following
     * constraints are satisfied:
     * The username consists of 8 to 30 characters inclusive.
     * If the username consists of less than 8 or 30 greater than  characters,
     * then it is an invalid username.
     * The username can only contain alphanumeric characters and underscores (_).
     * Alphanumeric characters describe the character set consisting of
     * lowercase characters [a-z] , uppercase characters [A-Z] , and digits [0-9] .
     * The first character of the username must be an alphabetic character, i.e.,
     * either lowercase character  or uppercase character .
     * <p></p>
     * Input Format
     * The first line of input contains an integer ,
     * describing the total number of usernames.
     * Each of the next  lines contains a string describing the username.
     * The locked stub code reads the inputs and validates the username.
     * Constraints
     * The username consists of any printable characters.
     * Output Format
     * For each of the usernames, the locked stub code prints
     * Valid if the username is valid; otherwise Invalid each on a new line.
     */
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases > 0) {
            String usernamePattern = scanner.nextLine().trim();
            System.out.println(usernamePattern.matches(regularExpression) ? "Valid" : "Invalid");
            testCases--;
        }

    }
}
