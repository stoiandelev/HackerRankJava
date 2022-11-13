package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task28_ArrayList {

        /**
     * input
     * 5
     * 5 41 77 74 22 44
     * 1 12
     * 4 37 34 36 52
     * 0
     * 3 20 22 33
     * 5
     * 1 3
     * 3 4
     * 3 1
     * 4 3
     * 5 5
     * output
     * 74
     * 52
     * 37
     * ERROR!
     * ERROR!
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        //initialize matrix
        List<List<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            List<Integer> subArr = new ArrayList<>();
            String[] numbers = scanner.nextLine().split(" ");

            for (int j = 1; j < numbers.length; j++) {
                subArr.add(Integer.parseInt(numbers[j]));
            }

            arrayList.add(subArr);
        }
        int queryNum = scanner.nextInt();
        for (int k = 0; k < queryNum; k++) {
            int q1 = scanner.nextInt();
            int q2 = scanner.nextInt();
            if (q1 > number || q2 > arrayList.get(q1 - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(arrayList.get(q1 - 1).get(q2 - 1));
            }
        }
    }
}
