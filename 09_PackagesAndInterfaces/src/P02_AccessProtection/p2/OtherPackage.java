package P02_AccessProtection.p2;

public class OtherPackage {
    OtherPackage() {
        P02_AccessProtection.p1.Protection p = new P02_AccessProtection.p1.Protection();
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
