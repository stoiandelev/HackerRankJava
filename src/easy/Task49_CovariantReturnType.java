package easy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task49_CovariantReturnType {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        Region region = switch (string) {
            case "WestBengal" -> new WestBengal();
            case "AndhraPradesh" -> new AndhraPradesh();
            default -> null;
        };

        Flower flower = region.yourNationalFlower();

        System.out.println(flower.whatsYourName());
    }
}

class Flower {
    public String whatsYourName() {
        return this.getClass().getSimpleName();
    }
}

class Jasmine extends Flower {
}

class Lily extends Flower {
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Flower yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {

    @Override
    public Flower yourNationalFlower() {
        return new Lily();
    }
}

//AndhraPradesh -> Lily