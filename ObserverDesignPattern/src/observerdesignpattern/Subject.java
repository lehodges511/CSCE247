/**
 * @author Lauren Hodges
 * interface is to be used in Cook.java to implement the below methods
 */
package observerdesignpattern;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String location, String description);
}
