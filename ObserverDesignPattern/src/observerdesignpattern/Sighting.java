/**
 * @author Lauren Hodges
 */
package observerdesignpattern;

/**
 * class allows object sighting to be created in Cartel
 */
public class Sighting {
    private String location;
    private String details;

    /**
     * Constructor for class Sighting
     */
    public Sighting(String location, String details){
        this.location=location;
        this.details=details;

    }

    /**
     * updates location
     */
    public String getLocation(){
        return this.location;
    }

    /**
     * updates details
     */
    public String getDetails(){
        return this.details;
    }
}
