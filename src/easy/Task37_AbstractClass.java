package easy;

import java.util.Scanner;

public class Task37_AbstractClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        MyBook myBook = new MyBook();
        myBook.setTitle(title);
        System.out.println("The title is: " + myBook.getTitle());
    }

}

abstract class Book {
    String title;

    abstract void setTitle(String string);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String string) {
        this.title = string;
    }
}
