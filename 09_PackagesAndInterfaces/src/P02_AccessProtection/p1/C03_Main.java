package P02_AccessProtection.p1;

public class C03_Main {
    C03_Main() {
        C01_Main p = new C01_Main();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);
        
        // Class only
        // System.out.println("n_pri = " + p.n_pri);
        
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
