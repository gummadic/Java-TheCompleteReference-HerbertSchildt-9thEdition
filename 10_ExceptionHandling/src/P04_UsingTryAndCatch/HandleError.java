package P04_UsingTryAndCatch;

import java.util.Random;

public class HandleError {
    public static void main(String args[]) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        Random r = new Random();
        
        for(int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch(ArithmeticException e) {
                System.out.println("Division by zero");
                a = 0; // Set a to zero and continue
            }
            
            System.out.println("a: " + a);
        }
    }    
}
