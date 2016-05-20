package P04_PassingLambdaExpressionAsArguments;

// Use lambda expressions as an argument to a method.

interface StringFunc {
    String func(String n);
}

public class LambdasAsArgumentsDemo {
    // This method has a functional iterface as the type of
    // its first parameter. Thus, it can be passed a reference to
    // any instance of that interface, inclusing the instance created
    // by a lambda expression.
    // The second parameter specifies the string to operate on.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    
    public static void main(String args[]) {
        String inStr = "Lambdas ass power to Java";
        String outStr;
        
        System.out.println("Here is input string: " + inStr);
        
        // Here, a simple expression lambda that uppercases a string
        // is passed to stringOp().
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string is uppercase: " + outStr);
        
        // This passes a block lambda that removes spaces.
        outStr = stringOp((str) -> {
                              String result = "";
                              int i;

                              for(i = 0; i < str.length(); i++)
                                  if(str.charAt(i) != ' ')
                                      result += str.charAt(i);

                              return result;
                          }, inStr);
        
        System.out.println("The string with spaces removed is: " + outStr);
        
        // Of course, it is also possible to pass a StringFunc instace
        // created by earlier lambda expressions. For example,
        // after this declaration executes, reverse to an
        // instance of StringFunc.
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            
            for(i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            
            return result;
        };
        
        // Now, reverse can be passed as the first parameter to stringOp()
        // since it refers to a StringFunc object.
        System.out.println("The string reverses: " +
                           stringOp(reverse, inStr));
    }
}
