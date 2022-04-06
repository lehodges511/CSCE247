/**
 * @author Lauren Hodges
 */
package observerdesignpattern;

import java.util.ArrayList;

/**
 * class allows Cartel to be created in the driver
 */
public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Constructor for class Cartel
     */
    public Cartel(Subject cook){
        this.cook = cook;
        sightings = new ArrayList<>();
        cook.registerObserver(this);
    }

    /**
     * creates new object "sighting" with location and description of cook
     */
    public void update(String location, String description){
        sightings.add(new Sighting(location,description));
    }

    /**
     * outputs the cartel's log of information about cook
     */
    public String getLog(){
        String log = "";
        for(Sighting sighting:sightings){
            log += sighting.getLocation();
            log += "(" +sighting.getDetails()+")\n";
        }
        return log;
    }
}
