package easy;

import java.util.*;

/**
 * Compares this object with the specified object for order.
 * Returns a negative integer, zero, or a positive integer as this object is less than,
 * equal to, or greater than the specified object.
 * negative integer -> as this object is less than
 * zero -> equal to
 * positive integer -> or greater than
 */

/**
 * Your task is to rearrange them according to their CGPA in decreasing order.
 * If two student have the same CGPA,
 * then arrange them according to their first name in alphabetical order.
 * If those two students also have the same first name,
 * then order them according to their ID.
 * No two students have the same ID.
 */

class Student implements Comparable<Student> {

    private int id;
    private String firstName;
    private double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCgpa() {
        return cgpa;
    }

    /**
     * Your task is to rearrange them according to their CGPA in decreasing order.
     * If two student have the same CGPA,
     * then arrange them according to their first name in alphabetical order.
     * If those two students also have the same first name,
     * then order them according to their ID.
     * No two students have the same ID.
     */
    @Override
    public int compareTo(Student anotherStudent) {
        return Comparator.comparingDouble(Student::getCgpa).reversed()
                .thenComparing(Student::getFirstName)
                .thenComparing(Student::getId)
                .compare(this, anotherStudent);
    }

}

public class Task33_Comparable {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = Integer.parseInt(scanner.nextLine());

            while (testCases > 0) {
                int id = scanner.nextInt();
                String firstName = scanner.next();
                double cgpa = scanner.nextDouble();

                Student student = new Student(id, firstName, cgpa);
                studentList.add(student);

                testCases--;
            }
        }

        Collections.sort(studentList);
        studentList.forEach(student -> System.out.println(student.getFirstName()));
    }
}