package P01_Enumerations;

// Use an enum constructor, instance variable, and method.
enum Apple2 {
    Jonathan(10),
    GoldenDel(9),
    RedDel(12),
    Winesap(15),
    Cortland(8);
    
    private final int price; // Price of each apple.
    
    // Constrcutor
    Apple2(int p) {
        price = p;
    }
    
    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String args[]) {
        Apple2 ap;
        
        // Display price for Winesap.
        System.out.println("Winesap costs: " + Apple2.Winesap.getPrice() + " cents.");
        System.out.println();
        
        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(Apple2 a : Apple2.values()) {
            System.out.println(a + " costs: " + a.getPrice() + " cents.");
        }
    }
}
