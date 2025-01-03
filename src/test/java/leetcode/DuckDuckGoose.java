package leetcode;

public class DuckDuckGoose {
    //https://www.codewars.com/kata/582e0e592029ea10530009ce/train/java
    public static void main(String[] args) {
        Player[] players = new Player[5];
        players[0] = new Player("Alice");
        players[1] = new Player("Bob");
        players[2] = new Player("Charlie");
        players[3] = new Player("Dave");
        players[4] = new Player("Eve");

        int goose = 3;
        String winner = duckDuckGoose(players, goose);
        System.out.println("The winner is: " + winner);

    }
    public static String duckDuckGoose(Player[] players, int goose) {
        // Note: Player objects have a String field called 'name'.

        return players[(goose - 1) % players.length].name;

    }
    public static class Player {
        public String name;

        public Player(String name) {
            this.name = name;
        }

    }
}

