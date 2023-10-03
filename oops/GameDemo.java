package oops;

class Game {
    String title;
    int noOfPlayers;
    float duration;

    public Game(String title,
            int noOfPlayers,
            float duration) {
        System.out.println("Parameterized Game Constructor Called");
        this.duration = duration;
        this.noOfPlayers = noOfPlayers;
        this.title = title;
    }

    public Game() {
        System.out.println("Default Game Constructor Called");
    }
}

class Cricket extends Game {
    public Cricket() {
        super();
        System.out.println("Default Cricket Constructor Called");

    }
}

class Football extends Game {
    public Football() {
        super();
        System.out.println("Default Football Constructor Called");
    }
}

public class GameDemo {

    public static void main(String[] args) {
        Cricket c1 = new Cricket();
        Football f1 = new Football();
    }
}