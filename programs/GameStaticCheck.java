package programs;

public class GameStaticCheck {

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
        System.out.println(GameStaticCheck.id);
        System.out.println("This is Main");
        GameStaticCheck robot = new GameStaticCheck();
        System.out.println(GameStaticCheck.id);
        GameStaticCheck robot2 = new GameStaticCheck();
        a();
    }

    static void a() {
        System.out.println("a called");
        b();
    }

    static void b() {
        System.out.println("b called");
    }

    static void c() {
        System.out.println("c called");
        a();
    }

    static {
        System.out.println("Static block 2");
    }
}