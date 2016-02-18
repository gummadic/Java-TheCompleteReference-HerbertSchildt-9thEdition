package P04_UsingTryAndCatch;

public class C01_Main {
    public static void main(String args[]) {
        int a;
        int d;
        
        try {
            a = 0;
            d = 42 / a;
            
            System.out.println("This is will not printed");
        } catch(ArithmeticException e) {
            System.out.println("Division by zero");
        }
        
        System.out.println("After catch statement");
    }
}
