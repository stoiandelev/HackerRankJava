package medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//5
//amy 100
//david 100
//heraldo 50
//aakansha 75
//aleksa 150


public class Task7_Comparator_Sort_Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfPlayer = scanner.nextInt();

        Player[] player = new Player[numberOfPlayer];
        Checker checker = new Checker();

        for (int i = 0; i < numberOfPlayer; i++) {
            player[i] = new Player(scanner.next(), scanner.nextInt());
        }
        scanner.close();

        Arrays.sort(player, checker);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }

    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player player1, Player player2) {
        if (player2.score == player1.score) {
            return player1.name.compareTo(player2.name);
        }
        return player2.score - player1.score;
    }
}

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
