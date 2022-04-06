package factorydesignpattern;

/**
 * @author Lauren Hodges
 * Represents cake of type Birthday Cake
 */
public class BirthdayCake extends Cake {
    /**
     * sets default information for birthday cake
     */
    public BirthdayCake(){
        super();
        name = "Birthday Cake";
        price = 109.99;
        numLayers = 1;
        shape = Shape.SHEET;
        flavor = "Funfetti";
        icing = "Vanilla";
        decorations.add("Sprinkles");
        decorations.add("Candy Flowers");
        decorations.add("Icing Writing");
    }
}
