package P04_AnnotationsMetadata;

import java.lang.reflect.*;

public class Meta2 {
    // myMeth no has two arguments.
    @MyAnno(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i) {
        Meta2 ob = new Meta2();
        
        try {
            Class<?> c = ob.getClass();
            
            // Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);
            
            MyAnno anno = m.getAnnotation(MyAnno.class);
            
            System.out.println(anno.str() + " " + anno.val());
        } catch(NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    
    public static void main(String args[]) {
        myMeth("test", 10);
    }
}
