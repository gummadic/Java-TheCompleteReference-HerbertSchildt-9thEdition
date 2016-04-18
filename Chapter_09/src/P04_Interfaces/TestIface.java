package P04_Interfaces;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    
    void nonIfaceMethod() {
        System.out.println("Classes that implement interfaces " +
                           "may also define other members, too");
    }
}

public class TestIface {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}
