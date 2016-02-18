package P13_ThreeRecentlyAddedExceptionFeatures;

public class C01_Main {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        int vals[] = {1, 2, 3};
        int result;
        
        try {
            result = a / b; // Generate an ArithmeticException.
            
            // vals[10] = 19; // Generate an ArrayIndexOutOfBoundsException.
        } 
        /* This catch statement catches both exceptions. */
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e);
        }
        
        System.out.println("After multi-catch");
    }
}
