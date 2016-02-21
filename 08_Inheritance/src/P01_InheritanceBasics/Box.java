package P01_InheritanceBasics;

// This program uses inheritance to extend Box.
public class Box {
    double width;
    double height;
    double depth;
    
    // Construct clone of an object.
    Box(Box ob) { // Pass object to constructor.
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    // Constructor used when all dimensions specified.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Constructor used when no dimensions specified.
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
