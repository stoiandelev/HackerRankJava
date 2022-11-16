package easy;

public class Task35_InheritanceOne {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.singing();
    }
}

class Animal {
     void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
     void fly() {
        System.out.println("I am flying");
    }

    void singing() {
        System.out.println("I am singing");
    }
}


