package factorydesignpattern;

/**
 * @author Lauren Hodges
 * Represents Cake of type Carrot Cake
 */
public class CarrotCake extends Cake {
    /**
     * sets default information for carrot cake
     */
    public CarrotCake(){
        super();
        name = "Carrot Cake";
        price = 54.99;
        numLayers = 2;
        shape = Shape.ROUND;
        flavor = "Carrot";
        icing = "Cream Cheese";
        decorations.add("Walnuts");
        decorations.add("Candy Carrots");

    }
}
