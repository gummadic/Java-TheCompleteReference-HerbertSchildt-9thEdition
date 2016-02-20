package P04_Interfaces;

public class InterfaceTest2 {
    public static void main(String args[]) {
        DynamicStack mystack1 = new DynamicStack(5);
        DynamicStack mystack2 = new DynamicStack(8);
        
        for(int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        
        for(int i = 0; i < 20; i++) {
            mystack2.push(i);
        }
        
        System.out.println("Stack in stack1:");
        
        for(int i = 0; i < 12; i++) {
            System.out.println(mystack1.pop());
        }
        
        System.out.println("Stack in mystack2:");
        
        for(int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
