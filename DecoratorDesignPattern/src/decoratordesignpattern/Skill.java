package decoratordesignpattern;

/**
 * represents a new skill learned by player
 * @author Lauren Hodges
 */
public class Skill extends PlayerDecorator {
    private Player player;

    /**
     * sets the player's name, intellect, attack, defense, weapon, and armor
     * @param player an object Player containing the above statistics
     */
    public Skill(Player player){
        super();
        this.player=player;
    }

    /**
     * adds more data to the player
     * @return String with what the player upgraded
     */
    public String toString(){
        return player.toString()+"\nGained a skill";
    }

    /**
     * calculates total updated power
     * @return double that is total power after upgrade
     */
    public double getPower(){
        return player.getPower()+2;
    }
}
