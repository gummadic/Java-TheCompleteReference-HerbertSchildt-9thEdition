package P04_Interfaces;

class A {
    public interface NestedInterface {
        boolean isNotNegative(int x);
    }
}

class B implements A.NestedInterface {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

public class NestedIFDemo {
    public static void main(String args[]) {
        A.NestedInterface nif = new B();
        
        if(nif.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        
        if(nif.isNotNegative(-12)) {
            System.out.println("This won't be displayed");
        }
    }
}
