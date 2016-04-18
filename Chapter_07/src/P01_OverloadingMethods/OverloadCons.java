package P01_OverloadingMethods;

/* Here, Box defines three constructors to initialize
the dimensions of a box various ways. */
class Box {
    double width;
    double height;
    double depth;
    
    // Constructor used when all dimesions specified.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Constructor used when no dimensions specified.
    Box() {
        width = -1;  // Use -a to indicate
        height = -1; // an uninitialized
        depth = -1;  // box.
    }
    
    // Constrcutor used when cube is created.
    Box(double len) {
        width = height = depth = len;
    }
    
    // Compute and return volume.
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String args[]) {
        // Create boxes using the varios constructors.
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        
        double vol;
        
        // Get volume of first box.
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        
        // Get volume of second box.
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        
        // Get volume of cube.
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}
