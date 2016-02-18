package P01_Packages;

public class C02_Main {
    public static void main(String args[]) {
        C01_Main current[] = new C01_Main[3];
        
        current[0] = new C01_Main("K. J. Fielding", 123.33);
        current[1] = new C01_Main("Will Tell", 157.02);
        current[2] = new C01_Main("Tom Jackson", -12.33);
        
        for(int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}
