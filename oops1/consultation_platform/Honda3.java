package oops1.consultation_platform;

class Bike {
    int speedlimit;
}

public class Honda3 extends Bike {
    int speedlimit;

    public Honda3(int a) {
        this.speedlimit = a;
    }

    public void test() {
        System.out.println("test");
    }

    public static void main(String args[]) {
        Bike obj = new Honda3(30);
        System.out.println(obj.speedlimit);// 90

    }
}