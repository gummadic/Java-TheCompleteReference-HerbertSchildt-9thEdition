package P02_UsingSuper;

// BoxWeight now uses super to initialize its Box attributes.
public class BoxWeight extends Box {
    double weight; // Weight of box.
    
    // Construct clone of an object.
    BoxWeight(BoxWeight ob) { // Pass object to constructor.
        super(ob);
        weight = ob.weight;
    }
    
    // Initialize width, height and depth using super().
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call superclass constructor.
        weight = m;
    }
    
    // Default constructor.
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
