class A{
    void read(){
        System.out.println("a");
    }
}
class B extends A{
    void read(){
        System.out.println("b");
    }
}
class C extends B{
    void read(){
        System.out.println("c");
    }
}
public class CC4 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        ref = a;
        ref.read();
        ref = b;
        ref.read();
        ref = c;
        ref.read();
    }
}
