package P04_Interfaces;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    
    void nonInterfaceMethod() {
        System.out.println("Classes that implement interfaces " +
                           "may also define other members, too");
    }
}
