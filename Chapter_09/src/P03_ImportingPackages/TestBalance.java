package P03_ImportingPackages;

import P03_ImportingPackages.pkg.Balance;

public class TestBalance {
    public static void main(String args[]) {
        /* Becauce Balance is public, you may use
        Balance class and call its constructor. */
        Balance test = new Balance("J. J. Jaspers", 99.88);
        
        test.show(); // Yoy may also call show()
    }
}
