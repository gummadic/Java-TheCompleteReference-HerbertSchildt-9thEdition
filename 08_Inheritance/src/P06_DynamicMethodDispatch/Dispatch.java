package P06_DynamicMethodDispatch;

// Dynamic method dispatch.
class A {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // Override callme().
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends A {
    // Override callme().
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

public class Dispatch {
    public static void main(String args[]) {
        A a = new A(); // Object of type A.
        B b = new B(); // Object of type B.
        C c = new C(); // Object of type C.
        
        A r; // Obtain a reference of type A.
        
        r = a; // r refers to an A object.
        r.callme(); // Calls A's version of callme.
        
        r = b; // r refers to a B object.
        r.callme(); // Calls B's version of callme.
        
        r = c; // r refers to a C object.
        r.callme(); // Calls C's version of callme.
    }
}
