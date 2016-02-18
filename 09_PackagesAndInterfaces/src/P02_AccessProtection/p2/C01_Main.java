package P02_AccessProtection.p2;

public class C01_Main extends P02_AccessProtection.p1.C01_Main {
    C01_Main() {
        System.out.println("derived other package constructor");
        
        // Class or package only
        // System.out.println("n = " + n);
        
        // Class only
        // System.out.println("n_pri = " + n_pri);
        
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
