package P04_Interfaces;

public class B implements A.NestedInterface {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
