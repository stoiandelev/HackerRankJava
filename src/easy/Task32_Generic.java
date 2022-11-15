package easy;

import java.util.ArrayList;
import java.util.List;

public class Task32_Generic {

    /**
     * Generic methods are a very efficient way to handle multiple datatype
     * using a single method. This problem will test your knowledge on Java Generic methods.
     * Let's say you have an integer array and a string array. You have to write
     * a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.
     * You are given code in the editor. Complete the code so that it prints the
     * following lines:
     * Do not use method overloading because your answer will not be accepted.
     * @param args
     */

    public static void main(String[] args) {

        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        printArray(intNumbers);
        printArray(strings);
    }

    public static <E> void printArray(List<E> element) {
        element.forEach(System.out::println);
    }

}
