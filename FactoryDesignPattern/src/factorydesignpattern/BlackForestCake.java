package factorydesignpattern;

/**
 * @author Lauren Hodges
 * represents a cake of type Black Forest Cake
 */
public class BlackForestCake extends Cake {
    /**
     * sets default information of Black Forest Cake
     */
    public BlackForestCake(){
        super();
        name = "Black Forest Cake";
        price = 47.99;
        numLayers = 3;
        shape = Shape.ROUND;
        flavor = "Black Forest";
        icing = "Whipped Cream";
        decorations.add("Cherries");
        decorations.add("Chocolate Flakes");
        decorations.add("Whipped Cream");
    }
}
