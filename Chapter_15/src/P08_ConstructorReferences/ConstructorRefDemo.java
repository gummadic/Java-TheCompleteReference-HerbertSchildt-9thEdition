package P08_ConstructorReferences;

// Demostrate a constructor reference.

// MyFunc is a functional interface whose method returns
// a MyClasss reference.
interface MyFunc {
    MyClass func(int n);
}

class MyClass {
    private int val;
    
    // This constructor takes an argument.
    MyClass(int v) {
        val = v;
    }
    
    // This is the default constructor.
    MyClass() {
        val = 0;
    }
    
    int getVal() {
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String args[]) {
        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // referers to the default constructor.
        MyFunc myClassCons = MyClass::new;
        
        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(1000);
        
        // Use the instance of MyClass just created.
        System.out.println("val in mc is: " + mc.getVal());
    }
}
