package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6_Loop {

    /**
     * Task
     * Given an integer, , print its first  multiples. Each multiple  (where )
     * should be printed on a new line in the form: N x i = result.
     * Input Format
     * A single integer,
     * Constraints
     * Output Format
     * Print  lines of output; each line  (where ) contains the  of  in the form:
     * N x i = result.
     */

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int count = 1;

        for (int i = 1; i <= 10; i++) {
            int sum = n * count;
            System.out.println(n + " x" + " " + count + " = " + sum);
            count++;

        }

        bufferedReader.close();
    }
}

