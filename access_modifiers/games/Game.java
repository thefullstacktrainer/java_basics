package access_modifiers.games;

public class Game {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

    private int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    protected int getC() {
        return this.c;
    }

    public int getD() {
        return this.d;
    }

    public static void main(String[] args) {
        Game g = new Game();

    }
}
