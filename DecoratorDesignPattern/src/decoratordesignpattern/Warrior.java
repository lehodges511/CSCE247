package decoratordesignpattern;

/**
 * represents a player of type Warrior
 * @author Lauren Hodges
 */
public class Warrior extends Player {
    /**
     * Creates a warrior with the specified name and given playing statistics
     * @param name the player's name
     */
    public Warrior(String name){
        super();
        this.name=name;
        intellect = 2;
        attack=8;
        defense=5;
        weapon="Sword";
        armor="Breast Plate";
    }

    /**
     * gets the data of the player
     * @return String with type of player and data
     */
    public String toString(){
        return "Warrior: "+super.toString();

    }
}
