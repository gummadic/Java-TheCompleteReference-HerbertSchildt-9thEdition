package P05_MultipleCatchClauses;

public class SuperSubCatch {
    public static void main(String args[]) {
        int a;
        int b;
        
        try {
            a = 0;
            b = 42 / a;
        } catch(Exception e) {
            System.out.println("Generic exception catch");
        } 
        /* This catch is never reached because ArithmeticException
        is a subclass of Exception */
        // catch(ArithmeticException e) {
        //     System.out.println("This is never reached");
        // }
    }
}
