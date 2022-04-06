package decoratordesignpattern;

/**
 * represents a player of type Mage
 * @author Lauren Hodges
 */
public class Mage extends Player {
    /**
     * creates a Mage with given name and playing statistics
     * @param name the player's name
     */
    public Mage(String name){
        super();
        this.name = name;
        intellect=7;
        attack=3;
        defense=4;
        weapon="Staf";
        armor="Robe";
    }

    /**
     * gets the data of the player
     * @return String with type of player and data
     */
    public String toString(){
        return "Mage: "+super.toString();
    }

}
