package iteratordesignpattern;
/**
 * @author Lauren Hodges
 * acts as a to do - an errand with specific attributes to be done
 */

import java.util.ArrayList;

public class ToDo {
    private String title;
    private String description;
    private double price;
    private String contact;
    private ArrayList<String> supplies;

    /**
     * sets default constructors
     * @param title name of to do
     * @param description what it is
     * @param price how much it will cost
     * @param contact who to contact
     * @param supplies what is needed for the to do
     */
    public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies){
        this.title = title;
        this.description = description;
        this.price = price;
        this.contact = contact;
        this.supplies = supplies;
    }

    /**
     * gets price for to do
     * @return double that is the price
     */
    public double getPrice(){
        return this.price;
    }

    /**
     * prints out the to do details
     * @return string with details
     */
    public String toString(){
        return "***** " + title + " *****\n" + description + "\nBusiness Contact: " + contact + "\nSupply List: "+ supplies + "\nPrice: $"+ price;
    }
}
