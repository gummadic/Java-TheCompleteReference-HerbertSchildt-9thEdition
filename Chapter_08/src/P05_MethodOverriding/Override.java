package P05_MethodOverriding;

// Method overriding.
class A {
    int i;
    int j;
    
    A(int a, int b) {
        i = a;
        j = b;
    }
    
    // Display i and j.
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    // Display k - this overrides show() in A.
    void show() {
        super.show(); // This calls A's show().
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        
        subOb.show(); // This class show in B.
    }
}
