/**
 * Lauren Hodges
 * class allows a pass behavior to be chosen for a given player
 */
package strategydesignpattern;

public class PassBehavior implements OffenceBehavior {
    public String play(){
        /**
         * assigns a pass behavior
         */
        return "passes to a forward";
    }
}
