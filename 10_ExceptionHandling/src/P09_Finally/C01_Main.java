package P09_Finally;

public class C01_Main {
    // Throw an exception out of the method.
    static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    
    // Return from within a try block.
    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }
    
    // Exceute a try block normally.
    static void procC() {
        try {
            System.out.println("Inside procC");
        } finally {
            System.out.println("procC's finally");
        }
    }
    
    public static void main(String args[]) {
        try {
            procA();
        } catch(Exception e) {
            System.out.println("Exception caught");
        }
        
        procB();
        procC();
    }
}
