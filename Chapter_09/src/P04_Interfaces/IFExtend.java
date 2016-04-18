package P04_Interfaces;

class MyClass implements B2 {
    public void method1() {
        System.out.println("Implement method1()");
    }
    
    public void method2() {
        System.out.println("Implement method2()");
    }
    
    public void method3() {
        System.out.println("Implement method3()");
    }
}

public class IFExtend {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        
        ob.method1();
        ob.method2();
        ob.method3();
    }
}
