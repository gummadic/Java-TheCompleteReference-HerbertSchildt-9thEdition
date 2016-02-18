package P02_AccessProtection.p2;

public class C02_Main {
    C02_Main() {
        P02_AccessProtection.p1.C01_Main p = new P02_AccessProtection.p1.C01_Main();
        System.out.println("other package constructor");
        
        // Class or package only
        // System.out.prtinln("n = " + p.n);
        
        // Class only
        // System.out.println("n_pri = " + p.n_pri);
        
        // Class, subclass or package only
        // System.out.println("n_pro = " + p.n_pro);
        
        System.out.println("n_pub = " + p.n_pub);
    }
}
