package P04_Interfaces;

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}

public class TestIface2 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        
        c.callback(42);
        
        c = ob; // c now refer to AnotherClient object.
        c.callback(42);
    }
}
