package co_varient_type;

public class TestInterface implements B {

    @Override
    public int add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int add(int a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}

interface A {
    abstract int add();

    abstract int add(int a);
}

interface B extends A {
    abstract int add();
}

interface C extends A, B {

}

class D extends TestInterface implements A, B, C {
    private int a;
    protected int b;
    int c;
    public int d;

    @Override
    public int add() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int add(int a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}