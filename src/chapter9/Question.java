package chapter9;

import java.util.Random;

public class Question implements SharedConstants {
    Random random = new Random();

    int asl() {
        int prob = (int) (100 * random.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if(prob<98){
            return SOON;
        } else return NEVER;
            
        }
    }