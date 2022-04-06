/**
 * @author Lauren Hodges
 */
package observerdesignpattern;

import java.util.ArrayList;

/**
 * class allows DEA to be created in the driver
 */
public class DEA implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;

    /**
     * constructor for class DEA
     */
    public DEA(Subject cook){
        this.cook = cook;
        locations = new ArrayList<String>();
        this.notes = "";
        cook.registerObserver(this);
    }

    /**
     * creates a new location with notes to go with it
     */
    public void update(String location, String description){
        locations.add(location);
        this.notes += "\n"+ description;
    }

    /**
     * outputs the DEA's log of information about cook
     */
    public String getLog(){
        String log = "Locations: ";
        for(String location:locations){
              log+=location;
              log+="\n";
        }
        log+="\nNotes: ";
        log+=notes;
        return log;
    }
}
