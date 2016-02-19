package P04_Interfaces;

public class TestInterface2 {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        
        c.callback(42);
        
        c = ob; // c now refer to AnotherClient object.
        c.callback(42);
    }
}
