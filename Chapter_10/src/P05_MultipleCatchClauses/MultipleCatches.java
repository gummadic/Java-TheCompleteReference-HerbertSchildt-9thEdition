package P05_MultipleCatchClauses;

public class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a;
            int b;
            int c[] = {1};
                    
            a = args.length;
                    
            System.out.println("a: " + a);
            
            b = 42 / a; // Comment this line to produce an ArrayIndexOutOfBoundsException 
            c[42] = 99;
        } catch(ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }
        
        System.out.println("After try/catch blocks");
    }
}
