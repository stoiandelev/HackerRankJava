package easy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Task46_Reflection {

    public static void main(String[] args) {

        //!Student std=new Student();
        //! uses class literal, not a function.
        Class std = Student.class;
        //Student std=new Student();
        // Class Student=new Student().getClass();
        Method[] mtd = std.getDeclaredMethods();

        ArrayList<String> methodNames = new ArrayList<>();
        for (Method it : mtd) {
            methodNames.add(it.getName()); //keep all method name into the string array
        }

        Collections.sort(methodNames);
        for (String it : methodNames) {
            System.out.println(it);
        }
    }
}

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

