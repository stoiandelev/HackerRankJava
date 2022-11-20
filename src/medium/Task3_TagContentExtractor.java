package medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_TagContentExtractor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            String line = scanner.nextLine();

            String regexPattern = "<(.+)>(\\w+[^<]*)</(\\1)>";
            Pattern pattern = Pattern.compile(regexPattern);
            Matcher matcher = pattern.matcher(line);
            int count = 0;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                count++;
            }

            if (count == 0) {
                System.out.println("None");
            }


        }
    }
}


//4
//<h1>Nayeem loves counseling</h1>
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//<Amee>safat codes like a ninja</amee>
//<SA premium>Imtiaz has a secret crush</SA premium>
