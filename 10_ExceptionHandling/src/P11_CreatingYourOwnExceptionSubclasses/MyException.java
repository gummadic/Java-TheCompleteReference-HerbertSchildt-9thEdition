package P11_CreatingYourOwnExceptionSubclasses;

public class MyException extends Exception {
    private int detail;
    
    MyException(int a) {
        detail = a;
    }
    
    public String toString() {
        return "C01_Main[" + detail + "]";
    }
}
