package P04_CreatingMultipleThreads;

// Create multiple threads.
class NewThread implements Runnable {
    String name; // Name of thread.
    Thread t;
    
    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread.
    }
    
    // This is the entry pointfor thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println(name + " Interrupted.");
        }
        
        System.out.println(name + " exiting.");
    }
}

public class MultiThreadDemo {
    public static void main(String args[]) {
        new NewThread("One"); // Start threads.
        new NewThread("Two");
        new NewThread("Three");
        
        try {
            // Wait for other threads to end.
            Thread.sleep(10000);
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        
        System.out.println("Main thread exiting.");
    }
}
