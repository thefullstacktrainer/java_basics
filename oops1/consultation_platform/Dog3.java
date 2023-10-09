package oops1.consultation_platform;

class Animal {
}

class Dog3 extends Animal {
    public void test() {
        System.out.println("Test");
    };

    static void method(Animal a) {
        if (a instanceof Dog3) {
            Dog3 d = (Dog3) a;// downcasting
            System.out.println("ok downcasting performed");
            d.test();
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog3();
        Dog3.method(a);
    }

}