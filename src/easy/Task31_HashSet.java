package easy;

import java.util.HashSet;
import java.util.Scanner;

public class Task31_HashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthOfPair = scanner.nextInt();

        scanner.nextLine();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < lengthOfPair; i++) {
            String twoPairWord = scanner.nextLine();
            set.add(twoPairWord);
            System.out.println(set.size());
        }

    }
}
