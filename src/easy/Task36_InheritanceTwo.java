package easy;

public class Task36_InheritanceTwo {

    public static void main(String[] args) {
        Add add = new Add();
        System.out.println("My superclass is: " + add.getClass().getSuperclass().getName());
        int first = add.add(30, 12);
        int second = add.add(11, 2);
        int third = add.add(10, 10);

        System.out.print(first + " ");
        System.out.print(second + " ");
        System.out.print(third);
    }
}

class Arithmetic {
    int add(int numberOne, int numberTow) {
        int sum = numberOne + numberTow;
        return sum;
    }
}

class Add extends Arithmetic {
    @Override
    int add(int numberOne, int numberTow) {
        return super.add(numberOne, numberTow);
    }
}
