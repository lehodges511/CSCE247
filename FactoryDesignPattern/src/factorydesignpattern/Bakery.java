package factorydesignpattern;

/**
 * @author Lauren Hodges
 *
 * This class creates a certain type of cake based off of the driver
 */
public class Bakery {
    /**
     * creates a cake with the given type
     * @param type the type of cake
     * @return Cake of type
     */
    public Cake orderCake(String type){
        return createCake(type);
    }

    /**
     * sets type of cake based on String from driver, creates new Cake of that type
     * @param type type of cake
     * @return Cake of specified type
     */
    private Cake createCake(String type){
        Cake cake=null;
        if(type.equals("carrot cake")){
            cake = new CarrotCake();
        }
        else if(type.equals("black forest cake")){
            cake = new BlackForestCake();
        }
        else if(type.equals("birthday cake")){
            cake = new BirthdayCake();
        }
        cake.createCake();
        System.out.println("Price: $"+cake.getPrice());
        return cake;

    }
}
