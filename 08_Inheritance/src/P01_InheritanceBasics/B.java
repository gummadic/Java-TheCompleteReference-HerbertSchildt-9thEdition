package P01_InheritanceBasics;

// Create a subclass by extending class A.
public class B extends A {
    int k;
    
    void showk() {
        System.out.println("k: " + k);
    }
    
    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
