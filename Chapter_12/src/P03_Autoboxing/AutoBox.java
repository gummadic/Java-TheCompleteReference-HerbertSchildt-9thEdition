package P03_Autoboxing;

// Demostrate autoboxing/unboxing.

public class AutoBox {
    public static void main(String args[]) {
        Integer iOb = 100; // Autobox an int.
        
        int i = iOb; // Auto-unbox.
        
        System.out.println(i + " " + iOb); // Displays 100 100.
    }
}
