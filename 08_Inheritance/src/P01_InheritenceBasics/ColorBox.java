package P01_InheritenceBasics;

// Here, Box is extended to include color.
public class ColorBox extends Box {
    int color; // Color of box.
    
    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
