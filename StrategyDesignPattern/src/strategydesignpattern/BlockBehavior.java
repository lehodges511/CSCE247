/**
 * Lauren Hodges
 * Class allows a block behavior to be chosen for a given player
 */
package strategydesignpattern;
import java.util.Random;

public class BlockBehavior implements DefenceBehavior {

    public String play(){
        /**
         * uses a random number generator to assign one of three blocking actions to the player
         */
        Random r = new Random();
        int rand = r.nextInt(3);
        if(rand==0)
            return "Blocks player from passing";
        else if(rand ==1)
            return "Blocks player from shootng";
        else
            return "checks player with puck";
    }
}
