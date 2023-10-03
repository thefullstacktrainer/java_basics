package oops;

public class InterfaceDemo {
    public static void main(String[] args) {
        S s = new S(200, 10);
        System.out.println(s.getMaxSpeed());

        System.out.println(s.getStdMileage());
    }
}

interface Car {
    static String companyName = "Mercedes";

    public abstract float getStdMileage();

    public abstract int getMaxSpeed();
}

class S implements Car {
    float mileage;
    int maxSpeed;

    S(int maxSpeed, float mileage) {
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
    }

    public float getStdMileage() {
        return this.mileage;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

}