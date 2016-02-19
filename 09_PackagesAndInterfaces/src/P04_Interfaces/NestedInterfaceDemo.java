package P04_Interfaces;

public class NestedInterfaceDemo {
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
