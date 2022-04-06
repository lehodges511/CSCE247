package decoratordesignpattern;

/**
 * represents a weapon upgrade for the player
 * @author Lauren Hodges
 */
public class WeaponUpgrade extends PlayerDecorator {
    private Player player;

    /**
     * sets the player's name, intellect, attack, defense, weapon, and armor
     * @param player an object Player containing the above statistics
     */
    public WeaponUpgrade(Player player){
        super();
        this.player=player;
    }

    /**
     * adds more data to the player
     * @return String with how the player was upgraded
     */
    public String toString(){

        return player.toString()+"\nUpgraded Weapon";
    }

    /**
     * calculates total updated power
     * @return double that is total power after upgrade
     */
    public double getPower(){
        return player.getPower()+5;
    }
}
