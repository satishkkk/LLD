package exercise.overrideMethodCall;

class A{
    public A(){
        foo();
    }
    public void foo(){
        System.out.println("A.foo()");
    }
}

class B extends A{
//    @Override
    public void foo() {
        System.out.println("B.foo()");
    }
}
public class MainClass {
    public static void main(String[] args) {
        B b = new B();
    }
}
