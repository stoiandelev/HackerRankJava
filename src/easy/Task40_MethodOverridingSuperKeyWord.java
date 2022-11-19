package easy;

public class Task40_MethodOverridingSuperKeyWord {

    public static void main(String[] args) {

        MotorCycle motorCycle = new MotorCycle();

    }
}

class BiCycle {

    String defineMe() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {

    @Override
    String defineMe() {
        return "a cycle with an engine.";
    }

    MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + defineMe());

        //викаме метода от супер класа с думата super.
        String temp = super.defineMe();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}
