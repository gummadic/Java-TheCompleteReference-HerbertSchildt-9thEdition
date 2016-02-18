package P03_UncaughtExceptions;

public class C01_Main {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }
    
    public static void main(String args[]) {
        C01_Main.subroutine();
    }
}
