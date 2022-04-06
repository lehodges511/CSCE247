package decoratordesignpattern;

/**
 * represents an upgrade in player's armor
 * @author Lauren Hodges
 */
public class ArmorUpgrade extends PlayerDecorator {
    private Player player;

    /**
     * sets the player's name, intellect, attack, defense, weapon, and armor
     * @param player an object Player containing the above statistics
     */
    public ArmorUpgrade(Player player){
        super();
        this.player=player;
    }

    /**
     * adds more data to the player
     * @return String with what player upgraded
     */
    public String toString(){
        return player.toString()+"\nUpgraded armor";
    }

    /**
     * calculates new power total
     * @return double that is the total power after the upgrade
     */
    public double getPower(){
        return player.getPower()+3;
    }
}
