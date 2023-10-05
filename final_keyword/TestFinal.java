package final_keyword;

public class TestFinal extends Demo {
    final int a;
    {
        a = 40;

    }
    final int d = 70;
    static final int b;
    static {
        b = 50;

    }
    static final int c = 60;

    final int e;

    TestFinal() {
        this.e = 80;
    }

    public static void main(String[] args) {
        final int a = 20;

        System.out.println(a);
        System.out.println(TestFinal.b);
        System.out.println(TestFinal.c);
        TestFinal t = new TestFinal();
        System.out.println(t.d);
        System.out.println(t.a);
        System.out.println(t.e);
        t.test();
    }

    public void test() {
        System.out.println("This is test from TestFinal class");
    }
}
