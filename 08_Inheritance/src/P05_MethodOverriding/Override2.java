package P05_MethodOverriding;

// Methods with differeing type signatures are overloaded - not
// overriden.
class A2 {
    int i;
    int j;
    
    A2(int a, int b) {
        i = a;
        j = b;
    }
    
    // Display i and j.
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Create a subclass by extending class A.
class B2 extends A2 {
    int k;
    
    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    // Overload show().
    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override2 {
    public static void main(String args[]) {
        B2 subOb = new B2(1, 2, 3);
        
        subOb.show("This is k: "); // This calls show() in B.
        subOb.show(); // This calls show() in A.
    }
}
