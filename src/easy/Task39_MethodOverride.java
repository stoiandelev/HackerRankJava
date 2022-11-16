package easy;

public class Task39_MethodOverride {

    public static void main(String[] args) {

        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        System.out.println("Generic Sports");
        sports.getNumberOfTeamMembers();

        System.out.println("Soccer Class");
        soccer.getNumberOfTeamMembers();


    }
}

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}
