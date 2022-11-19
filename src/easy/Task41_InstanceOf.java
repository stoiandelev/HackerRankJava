package easy;

import java.util.ArrayList;
import java.util.Scanner;

import static easy.InstanceOFTutorial.count;

public class Task41_InstanceOf {

    //Original Task is with Student class, we need to replace everywhere

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            String string = scanner.next();
            if(string.equals("Students"))list.add(new Students());
            if(string.equals("Rockstar"))list.add(new Rockstar());
            if(string.equals("Hacker"))list.add(new Hacker());
        }

        System.out.println(count(list));
    }
}


class InstanceOFTutorial {

    static String count(ArrayList list) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (Object element : list) {
            if (element instanceof Student) {
                a++;
            }
            if (element instanceof Rockstar) {
                b++;
            }

            if (element instanceof Hacker) {
                c++;
            }
        }
        return a + " " + Integer.toString(b) + " " + Integer.toString(c);
    }
}

class Students { }

class Rockstar { }

class Hacker { }

