package P04_AnnotationsMetadata;

import java.lang.annotation.*;
import java.lang.reflect.*;

// A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // This variable name must be value.
}

public class Single {
    // Annotate a method using a single-memeber annotation.
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        
        try {
            Method m = ob.getClass().getMethod("myMeth");
            
            MySingle anno = m.getAnnotation(MySingle.class);
            
            System.out.println(anno.value()); // Display 100.
        } catch(NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }
    
    public static void main(String args[]) {
        myMeth();
    }
}
