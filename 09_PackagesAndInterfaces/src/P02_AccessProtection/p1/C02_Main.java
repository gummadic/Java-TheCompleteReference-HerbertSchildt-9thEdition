package P02_AccessProtection.p1;

public class C02_Main extends C01_Main {
    C02_Main() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        
        // Class only
        // System.out.println("n_pri = " + n_pri);
        
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
