package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task29_List {

    /**
     * The first line contains an integer, N (the initial number of elements in  L).
     * The second line contains N space-separated integers describing L.
     * The third line contains an integer,  Q (the number of queries).
     * The 2Q  subsequent lines describe the queries, and each query is described over two lines:
     * <p></p>
     * If the first line of a query contains the String Insert,
     * then the second line contains two space separated integers ,
     * and the value x, y  must be inserted into y at index .
     * If the first line of a query contains the String Delete,
     * then the second line contains index , whose element must be deleted from L.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int initialNumber = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();

        //fill the list
        for (int i = 0; i < initialNumber; i++) {
            numbers.add(scanner.nextInt());
        }

        int numberOfQueries = scanner.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            String queries = scanner.next();
            if (queries.equals("Insert")) {
                int indexToInsert = scanner.nextInt();
                int numberForInsert = scanner.nextInt();
                numbers.add(indexToInsert, numberForInsert);

            } else if (queries.equals("Delete")) {
                int indexToDeleteNumber = scanner.nextInt();
                numbers.remove(indexToDeleteNumber);
            }

        }
        numbers.forEach(result -> System.out.print(result + " "));
    }
}
