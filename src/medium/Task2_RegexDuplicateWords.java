package medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2_RegexDuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);
        int numSentences = Integer.parseInt(scanner.nextLine());

        while (numSentences-- > 0) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (matcher.find()) {
                input = input.replaceAll(matcher.group(0), matcher.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }
        scanner.close();
    }
}


//5
//Goodbye bye bye world world world
//Sam went went to to to his business
//Reya is is the the best player in eye eye game
//in inthe
//Hello hello Ab aB