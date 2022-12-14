package medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * There are a number of students in a school who wait to be served.
 * Two types of events, ENTER and SERVED, can take place which are described below.
 * ENTER: A student with some priority enters the queue to be served.
 * SERVED: The student with the highest priority is served (removed) from the queue.
 * A unique id is assigned to each student entering the queue. The queue serves the students
 * based on the following criteria (priority criteria):
 * The student having the highest Cumulative Grade Point Average (CGPA) is served first.
 * Any students having the same CGPA will be served by name in ascending case-sensitive
 * alphabetical order.
 * Any students having the same CGPA and name will be served in ascending order of the id.
 * Create the following two classes:
 * The Student class should implement:
 * The constructor Student(int id, String name, double cgpa).
 * The method int getID() to return the id of the student.
 * The method String getName() to return the name of the student.
 * The method double getCGPA() to return the CGPA of the student.
 * The Priorities class should implement the method
 * List<Student> getStudents(List<String> events) to process all the given events and
 * return all the students yet to be served in the priority order.
 * Input Format
 * The first line contains an integer, , describing the total number of events.
 * Each of the  subsequent lines will be of the following two forms:
 * ENTER name CGPA id: The student to be inserted into the priority queue.
 * SERVED: The highest priority student in the queue was served.
 * The locked stub code in the editor reads the input and tests the correctness
 * of the Student and Priorities classes implementation.
 * Constraints
 * Output Format
 * The locked stub code prints the names of the students yet to be
 * served in the priority order. If there are no such student, then the code prints EMPTY.
 * >p
 * 12
 * ENTER John 3.75 50
 * ENTER Mark 3.8 24
 * ENTER Shafaet 3.7 35
 * SERVED
 * SERVED
 * ENTER Samiha 3.85 36
 * SERVED
 * ENTER Ashley 3.9 42
 * ENTER Maria 3.6 46
 * ENTER Anik 3.95 49
 * ENTER Dan 3.95 50
 * SERVED
 * >p
 * Dan
 * Ashley
 * Shafaet
 * Maria
 */

public class Task9_Priority_Queue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }

    }
}

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> studentList = new ArrayList<Student>();

        for (String event : events) {
            String[] temp = event.split(" ");

            if (temp[0].equals("ENTER")) {
                Student student = new Student(Integer.parseInt(temp[3]), temp[1], Double.parseDouble(temp[2]));
                studentList.add(student);
            } else if (temp[0].equals("SERVED")) {
                if (!studentList.isEmpty()) {
                    studentList = studentList.stream()
                            .sorted(Comparator.comparing(Student::getCGPA).reversed()
                                    .thenComparing(Student::getName)
                                    .thenComparing(Student::getID))
                            .collect(Collectors.toList());
                    studentList.remove(0);
                }
            }
        }
        return studentList;
    }
}
