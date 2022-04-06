package factorydesignpattern;

import java.util.ArrayList;

/**
 * @author Lauren Hodges
 * allows an object, Cake, to be created and assigned
 */
public abstract class Cake {
    protected String name;
    protected double price;
    protected int numLayers;
    protected ArrayList<String> decorations = new ArrayList<String>();
    protected Shape shape;
    protected String flavor;
    protected String icing;

    /**
     * calls methods to set proper layers, frosting, and decorations
     */
    public void createCake(){
        createLayers();
        frostCake();
        addDecorations();
    }

    /**
     * sets number of layers based on shape, prints out flavor, shape, and layer number of cake
     */
    private void createLayers(){
        if(shape == Shape.CUPCAKES){
            System.out.println("Creating " + flavor + " cupcakes.");
        }
        else if(shape == Shape.BUNT){
            System.out.println("Creating a "+flavor+" bunt cake.");
        }
        else if(numLayers == 1 && (shape == Shape.SHEET || shape == Shape.ROUND)){
            System.out.println("Creating a 1 layer "+ shape.toString().toLowerCase()+" "+flavor+" cake.");
        }
        else if(numLayers > 1 && (shape == Shape.SHEET || shape == Shape.ROUND)){
            System.out.println("Creating a "+numLayers+" layered "+shape.toString().toLowerCase()+" "+flavor+" cake.");
        }
    }

    /**
     * prints out what type of frosting is used for given cake
     */
    private void frostCake(){
        System.out.println("Frost cake with "+icing+" icing.");
    }

    /**
     * adds decorations for given cake to the decorations array, prints out decorations
     */
    private void addDecorations(){
        for(int i=0; i<decorations.size(); i++){
            System.out.println("Adding "+ decorations.get(i));
        }

    }

    /**
     * gets price of cake
     * @return double, price of cake
     */
    public double getPrice(){
        return this.price;
    }
}
