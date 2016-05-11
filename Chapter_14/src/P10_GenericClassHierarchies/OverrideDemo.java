package P10_GenericClassHierarchies;

// Overriding a generic method in a generic class.
class Gen6<T> {

    T ob; // declare an object of type T
    
    // Pass the constructor a reference to
    // an object of type T.
    Gen6(T o) {
        ob = o;
    }
    
    // Return ob.
    T getob() {
        System.out.print("Gen6's getob(): ");
        return ob;
    }
}

// A subclass of Gen that overrides getob().
class Gen7<T> extends Gen6<T> {

    Gen7(T o) {
        super(o);
    }
    
    // Override getob().
    T getob() {
        System.out.print("Gen7's getob(): ");
        return ob;
    }
}

// Demonstrate generic method override.
class OverrideDemo {

    public static void main(String args[]) {
        // Create a Gen object for Integers.
        Gen6<Integer> iOb = new Gen6<Integer>(88);
        
        // Create a Gen7 object for Integers.
        Gen7<Integer> iOb2 = new Gen7<Integer>(99);
        
        // Create a Gen7 object for Strings.
        Gen7<String> strOb2 = new Gen7<String>("Generics Test");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
