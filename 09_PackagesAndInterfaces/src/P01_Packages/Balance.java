package P01_Packages;

public class Balance {
    String name;
    double balance;
    
    Balance(String n, double b) {
        name = n;
        balance = b;
    }
    void show() {
        if(balance < 0) {
            System.out.print("--> ");
        }
        
        System.out.println(name + ": $" + balance);
    }
}
