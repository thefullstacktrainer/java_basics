package revision.basics;

public class StaticDemo {
    static int a = 10;
    int d = 20;
    final int m;
    static final int n = 30;

    static {

    }

    {
        m = 20;
    }

    public StaticDemo() {

    }

    static {
        System.out.println(StaticDemo.a);
    }

    {
        System.out.println("Instance block");
        System.out.println(a);
        System.out.println(this.d);
    }

    public int add(int c, int d) {
        System.out.println(c + d);
        return 0;
    }

    static void test() {
        a = 30;
    }

    public static void main(String[] args) {
        System.out.println("Main");
        StaticDemo st = new StaticDemo();
        st.add(4, 5);
    }

}
