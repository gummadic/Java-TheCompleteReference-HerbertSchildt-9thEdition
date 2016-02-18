package P08_Throws;

public class C01_Main {
    static void throwOne() throws IllegalAccessException {
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }
    
    public static void main(String args[]) {
        try {
            throwOne();
        } catch(IllegalAccessException e) {
            System.out.println("Caught: " + e);
        }
    }
}
