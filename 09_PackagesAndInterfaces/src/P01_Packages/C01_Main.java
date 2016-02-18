package P01_Packages;

public class C01_Main {
    String name;
    double balance;
    
    C01_Main(String n, double b) {
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
