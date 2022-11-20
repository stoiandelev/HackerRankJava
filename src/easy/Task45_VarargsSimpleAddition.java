package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Task45_VarargsSimpleAddition {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int number1 = Integer.parseInt(br.readLine());
            int number2 = Integer.parseInt(br.readLine());
            int number3 = Integer.parseInt(br.readLine());
            int number4 = Integer.parseInt(br.readLine());
            int number5 = Integer.parseInt(br.readLine());
            int number6 = Integer.parseInt(br.readLine());
            Add objectAdd = new Add();
            objectAdd.add(number1, number2);
            objectAdd.add(number1, number2, number3);
            objectAdd.add(number1, number2, number3, number4, number5);
            objectAdd.add(number1, number2, number3, number4, number5, number6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class Add {
    void add(int... a) {
        int sum = 0;
        StringBuilder sb = new StringBuilder("");
        for (int i : a) {
            sum += i;
        }
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                sb.append(a[i]);
                sb.append("=");

            } else {
                sb.append(a[i]);
                sb.append("+");
            }
        }

        System.out.println(sb.append(sum));

    }
}
