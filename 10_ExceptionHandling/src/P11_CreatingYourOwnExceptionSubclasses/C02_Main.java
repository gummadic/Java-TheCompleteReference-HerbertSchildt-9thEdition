package P11_CreatingYourOwnExceptionSubclasses;

public class C02_Main {
    static void compute(int a) throws C01_Main {
        System.out.println("Called compute(" + a + ")");
        
        if(a > 10) {
            throw new C01_Main(a);
        }
        
        System.out.println("Normal exit");
    }
    
    public static void main(String args[]) {
        try {
            compute(1);
            compute(20);
        } catch(C01_Main e) {
            System.out.println("Caught: " + e);
        }
    }
}
