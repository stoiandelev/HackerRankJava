package easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int firstLength = scanner.nextInt();
        int secondLength = scanner.nextInt();

        for (int i = 0; i < firstLength; i++) {
            list.add(scanner.nextInt());
        }

        list.add("###");

        for (int i = 0; i < secondLength; i++) {
            list.add(scanner.next());
        }


        Iterator iterator = func(list);
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println((String) element);
        }
    }


    static Iterator func(ArrayList list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof String)
                break;
        }
        return iterator;
    }

}
