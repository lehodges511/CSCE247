/**
 * Lauren Hodges
 * class allows a player to chase the puck
 */
package strategydesignpattern;

public class ChasePuckBehavior implements DefenceBehavior {
    public String play(){
        /**
         * sets action to chasing the puck
         */
        return "Chases the puck";
    }
}
