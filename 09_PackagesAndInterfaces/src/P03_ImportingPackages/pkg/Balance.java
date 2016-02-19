package P03_ImportingPackages.pkg;

/* Now, the Balance class, its constructor, and its
show() method are public. This means that they can
be used by non-subclass code outside their package. */
public class Balance {
    String name;
    double balance;
    
    public Balance(String n, double b) {
        name = n;
        balance = b;
    }
    
    public void show() {
        if(balance < 0) {
            System.out.print("--> ");
        }
        
        System.out.println(name + ": $" + balance);
    }
}
