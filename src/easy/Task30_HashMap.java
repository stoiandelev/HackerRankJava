package easy;

import java.util.HashMap;
import java.util.Scanner;

public class Task30_HashMap {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfEntries = scanner.nextInt();

        scanner.nextLine();

        HashMap<String, Integer> mapPhoneBook = new HashMap<>();

        for (int i = 0; i < numberOfEntries; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            mapPhoneBook.put(key, value);
            scanner.nextLine();
        }
        // System.out.println(mp);
        while (scanner.hasNext()) {
            String query = scanner.nextLine();
            if (mapPhoneBook.get(query) != null) {
                System.out.println(query + "=" + mapPhoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
