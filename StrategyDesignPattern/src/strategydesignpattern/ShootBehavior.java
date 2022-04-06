/**
 * Lauren Hodges
 * class allows a player to shoot at the goal
 */
package strategydesignpattern;

public class ShootBehavior implements OffenceBehavior {
    public String play(){
        /**
         * assigns a shoot behavior
         */
        return "shoots at the goal";
    }
}
