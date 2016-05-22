package P08_ConstructorReferences;

// Implement a simple class factory using a constructor reference.

interface MyFunc3<R, T> {
    R func(T n);
}

// A simple generic class.
class MyClass3<T> {
    private T val;
    
    // A constructor that takes an argument.
    MyClass3(T v) {
        val = v;
    }
    
    // The default constructor. This constructor
    // is NOT used by this program.
    MyClass3() {
        val = null;
    }
    
    T getVal() {
        return val;
    }
}

// A simple, non-generic class.
class MyClass4 {
    String str;
    
    // A constructor that takes an argument.
    MyClass4(String s) {
        str = s;
    }
    
    // The default contructor. This
    // constructor is NOT used by this program.
    MyClass4() {
        str = "";
    }
    
    String getVal() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    // a factpry method for class objects. The class must
    // have a constructor that takes one parameter of type T.
    // R specifies the type of object being created.
    static <R, T> R myClassFactory(MyFunc3<R, T> cons, T v) {
        return cons.func(v);
    }
    
    public static void main(String args[]) {
        // Create a reference to a MyClass3 constructor.
        // In this case, new refers to the constructor that
        // takes an argument.
        MyFunc3<MyClass3<Double>, Double> myClassCons = MyClass3<Double>::new;
        
        // Create an instance of MyClass by use of the factory method.
        MyClass3<Double> mc = myClassFactory(myClassCons, 100.1);
        
        // Use the instance of MyClass3 just created.
        System.out.println("val in mc is: " + mc.getVal());
        
        // Now, create a different class by use of myClassFactory().
        MyFunc3<MyClass4, String> myClassCons2 = MyClass4::new;
        
        // Create an instance of MyClass4 by use of the factory method.
        MyClass4 mc2 = myClassFactory(myClassCons2, "Lambda");
        
        // Use the instance of myClass3 just created.
        System.out.println("str in mc2 is: " + mc2.getVal());
    }
}
