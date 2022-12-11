package medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

//6 3
//5 3 5 2 3 2

//Print the maximum number of unique integers among all
// possible contiguous sub-arrays of size M.

public class Task8_Unique_Number_SubArray_Deque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int end = m - 1;

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i <= end; i++)
            deque.add(scanner.nextInt());

        HashSet<Integer> set = new HashSet<>();
        set.addAll(deque);

        int maxSize = set.size();
        while (end < n - 1) {
            end++;
            set.remove(deque.poll());
            deque.add(scanner.nextInt());
            set.clear();
            set.addAll(deque);
            maxSize = Math.max(maxSize, set.size());
        }
        System.out.print(maxSize);
    }
}
