package P04_Interfaces;

public class TestInterface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}
