package P02_UsingSuper;

// A complete implementation of BoxWeight.
public class Box {
    private double width;
    private double height;
    private double depth;
    
    // Construct clone of an object.
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
