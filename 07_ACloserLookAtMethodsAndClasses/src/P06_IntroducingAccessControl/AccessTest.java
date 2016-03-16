package P06_IntroducingAccessControl;

/* This program demostrates the difference between
public and private. */
class Test {
    int a; // Default access.
    public int b; // Public access.
    private int c; // Private access.
    
    // Methods to access c.
    void setc(int i) { // Set c's value.
        c = i;
    }
    
    int getc() { // Get c's value.
        return c;
    }
}

public class AccessTest {
    public static void main(String args[]) {
        Test ob = new Test();
        
        // These are OK, a and b may be accessed directly.
        ob.a = 10;
        ob.b = 20;
        
        // This is not OK and will acuse an error.
        // ob.c = 100; // Error!
        
        // You musta ccess c through its methods
        ob.setc(100); // OK.
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
