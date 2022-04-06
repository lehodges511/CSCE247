
package observerdesignpattern;

import java.util.ArrayList;
/**
 * @author Lauren Hodges
 * class Cook allows object cook to be created in driver
 */
public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Constructor for attributes of class Cook
     */
    public Cook(String name){
        this.name = name;
        this.observers = new ArrayList<Observer>();
    }

    /**
     * allows an observer to be put into the array list if the said observer is not already a part of it
     */
    public void registerObserver(Observer observer){
        if(!observers.contains(observer))
            observers.add(observer);
    }

    /**
     * allows an observer that is already in the array list to be removed
     */
    public void removeObserver(Observer observer){
        if(observers.contains(observer))
            observers.remove(observer);
    }

    /**
     * tells each observer in the array list the updated location and description of Cook
     */
    public void notifyObservers(String location, String description){
        for(Observer observer:observers){
            observer.update(location, description);
        }
    }

    /**
     * allows sighting to be entered and the observers to be notified of it
     */
    public void enterSighting(String location, String description){
        notifyObservers(location, description);
    }
    public String getName(){
        return name;
    }
}
