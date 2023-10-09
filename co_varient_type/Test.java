package co_varient_type;

class B {
    public int add(int a) {
        System.out.println("Test");
        return 0;
    }
}

public class Test extends B {

    public int add() {
        return 10;
    }

    // public int add(int b) {
    // System.out.println("B");
    // return 10;
    // }

    public static void main(String[] args) {
        Test b = new Test();
        System.out.println(b.add(30));
        H h = new H();
        System.out.println(h.add());
        G i = new G();
        System.out.println(i.add(3));
    }
}

class G extends Object {
    G add() {
        System.out.println("G method");
        return this;
    }

    G add(int a) {
        System.out.println("G method i");
        return this;
    }
}

class H extends G {
    H add() {
        System.out.println("H method");
        return this;
    }

    H add(int a) {
        System.out.println("H method i");
        return this;
    }
}

class I extends H {

}