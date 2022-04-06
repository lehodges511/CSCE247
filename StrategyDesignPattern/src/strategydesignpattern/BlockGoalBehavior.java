/**
 * Lauren Hodges
 * class allows a block goal behavior to be chosen for goalie
 */
package strategydesignpattern;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
    public String play(){
        /**
         * uses a random number generator to assign one of 4 goal blocking actions to the goalie
         */
        Random r = new Random();
        int rand = r.nextInt(4);
        if(rand==0)
            return "catches the puck";
        else if(rand==1)
            return "hand blocks the puck";
        else if(rand==2)
            return "blocks puck with stick";
        else
            return "blocks puck with knee pads";
    }
}
