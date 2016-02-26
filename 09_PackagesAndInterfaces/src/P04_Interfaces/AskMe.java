package P04_Interfaces;

import java.util.Random;

class Question implements SharedConstants {
    Random rand = new Random();
    
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        
        if(prob < 30) {
            return NO;
        } else if(prob < 60) {
            return YES;
        } else if(prob < 75) {
            return LATER;
        } else if(prob < 98) {
            return SOON;
        } else {
            return NEVER;
        }
    }
}

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch(result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }
    
    public static void main(String args[]) {
        Question q = new Question();
        
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
