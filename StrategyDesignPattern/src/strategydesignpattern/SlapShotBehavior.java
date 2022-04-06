/**
 * Lauren Hodges
 * class allows player to do a slapshot
 */
package strategydesignpattern;

public class SlapShotBehavior implements OffenceBehavior {
    public String play(){
        /**
         * assigns slapshot action to player
         */
        return "shoots the puck from the blue line";
    }
}
