package programs;

public class Game {

    static int id;
    static {
        id = 1;
        System.out.println("Static block 1");
    }
    {
        id = 2;
        System.out.println("Normal block 1");
    }
    {
        System.out.println("Normal block 2");
    }

    public static void main(String[] args) {
        System.out.println(Game.id);
        System.out.println("This is Main");
        Game robot = new Game();
        System.out.println(Game.id);
        Game robot2 = new Game();
    }

    static void a() {
        System.out.println("a called");
        b();
    }

    static void b() {
        System.out.println("a called");
    }

    static void c() {
        System.out.println("a called");
        a();
    }

    static {
        System.out.println("Static block 2");
    }
}