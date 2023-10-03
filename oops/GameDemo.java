package oops;

abstract class Game {
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

    public abstract void getTitle();
}

class Cricket extends Game {
    public Cricket() {
        super();
        System.out.println("Default Cricket Constructor Called");

    }

    public void getTitle() {
        System.out.println("Cricket " + this.title);
    }
}

class Football extends Game {
    public Football() {
        super();
        System.out.println("Default Football Constructor Called");
    }

    public void getTitle() {
        System.out.println("Football " + this.title);
    }
}

public class GameDemo {

    public static void main(String[] args) {
        Cricket c1 = new Cricket();
        Football f1 = new Football();
        c1.getTitle();
        f1.getTitle();
    }

}