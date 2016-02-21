package P01_InheritenceBasics;

// Here, Box is extended to include weight.
public class BoxWeight extends Box {
    double weight; // Weight of box.
    
    // Constructor for BoxWeight.
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
