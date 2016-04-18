package P02_AccessProtection.p2;

class Protection2 extends P02_AccessProtection.p1.Protection {
    Protection2() {
        System.out.println("derived other package constructor");
        
        // Class or package only
        // System.out.println("n = " + n);
        
        // Class only
        // System.out.println("n_pri = " + n_pri);
        
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class OtherPackage {
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

public class Demo {
    public static void main(String args[]) {
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}
