/**
 * @author Lauren Hodges
 * interface to be used in classes DEA.java and Cartel.java to implement the below methods
 */
package observerdesignpattern;

public interface Observer {
    public void update(String location, String description);

    public String getLog();
}
