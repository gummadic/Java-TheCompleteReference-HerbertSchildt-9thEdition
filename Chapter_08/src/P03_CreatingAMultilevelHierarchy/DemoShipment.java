package P03_CreatingAMultilevelHierarchy;

// Extend BoxWeight to include shipping costs.

// Start with Box.
class Box {
    private double width;
    private double height;
    private double depth;
    
    // Construct clone of and object.
    Box(Box ob) { // Pass object to constructor.
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    // Constructor used when all dimesions specified.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Constructor used when no dimesions specified.
    Box() {
        width = -1;  // Use -1 to indicate
        height = -1; // an uninitialized
        depth = -1;  // box.
    }
    
    // Constructor used when cube is created.
    Box(double len) {
        width = height = depth = len;
    }
    
    // Compute and return volume.
    double volume() {
        return width * height * depth;
    }
}

// Add weigth.
class BoxWeight extends Box {
    double weight; // Weight of box.
    
    // Construct clone ob and object.
    BoxWeight(BoxWeight ob) { // Pass object to constructor.
        super(ob);
        weight = ob.weight;
    }
    
    // Constructor when all parameters are specified.
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call superclass constructor.
        weight = m;
    }
    
    BoxWeight() {
        super();
        weight = -1;
    }
    
    // Constructor used when cube is created.
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// Add shipping costs.
class Shipment extends BoxWeight {
    double cost;
    
    // Construct clone of an object.
    Shipment(Shipment ob) { // Pass object to construcotr.
        super(ob);
        cost = ob.cost;
    }
    
    // Constructor when all parameters are specified.
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // Call superclass constructor.
        cost = c;
    }
    
    // Default constructor.
    Shipment() {
        super();
        cost = -1;
    }
    
    // Construcotr used when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        
        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();
        
        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
        System.out.println();
    }
}
