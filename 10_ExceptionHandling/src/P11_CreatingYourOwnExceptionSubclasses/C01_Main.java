package P11_CreatingYourOwnExceptionSubclasses;

public class C01_Main extends Exception {
    private int detail;
    
    C01_Main(int a) {
        detail = a;
    }
    
    public String toString() {
        return "C01_Main[" + detail + "]";
    }
}
