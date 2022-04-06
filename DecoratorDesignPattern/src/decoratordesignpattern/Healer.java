package decoratordesignpattern;

/**
 * represents player of type Healer
 * @author Lauren Hodges
 */
public class Healer extends Player {
    /**
     * creates a healer with the specified name and given playing statistics
     * @param name name of the player
     */
    public Healer(String name){
        super();
        this.name=name;
        intellect=8;
        attack=2;
        defense=3;
        weapon="Staf";
        armor="Robe";
    }
    /**
     * gets the data of the player
     * @return String with type of player and data
     */
    public String toString(){
        return "Healer: "+super.toString();
    }
}
