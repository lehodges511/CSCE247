package decoratordesignpattern;
/**
 * represents a player in the game
 * @author Lauren Hodges
 */
abstract public class Player {

    protected String name;
    protected int intellect;
    protected int defense;
    protected int attack;
    protected String weapon;
    protected String armor;

    /**
     * Gets the data of the player
     * @return a string with name, weapon and armor of the player
     */
    public String toString(){
        return name+"\nCarries a "+weapon+", and wears a "+armor;

    }

    /**
     * Calculates the player's total power
     * @return double with the power total for the player
     */
    public double getPower(){
        return attack*3+defense+intellect/2;
    }
}
