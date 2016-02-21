package P02_UsingSuper;

// Create a subclass by extending class A.
public class B extends A {
    int i; // This i hides i in A.
    
    B(int a, int b) {
        super.i = a; // i in A.
        i = b; // i in B.
    }
    
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
