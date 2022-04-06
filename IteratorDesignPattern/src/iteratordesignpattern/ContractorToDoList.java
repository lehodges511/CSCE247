package iteratordesignpattern;
/**
 * @author Lauren Hodges
 * acts as a to do list
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ContractorToDoList extends ToDoIterator {
    private String address;
    private ToDo[] todos;
    private int count;

    /**
     * sets default constructors
     * @param string address to be added to list
     */
    public ContractorToDoList(String string){
        super(null);
        todos = new ToDo[2];
        this.address = string;
        createIterator();
        count = 0;
    }

    /**
     * adds a To do to the to do list
     * @param title title of to do
     * @param description what the to do is
     * @param price how much it will cost
     * @param contact name of contact for to do
     * @param supplies list of supplies for to do
     */
    public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies){
        ToDo todo = new ToDo(title, description, price, contact, supplies);
        if(todos.length == count){
            todos = growArray(todos);
        }
        todos[count] = todo;
        count++;
    }

    /**
     * adds space to the array to allow for more to dos
     * @param todos list of to dos
     * @return list of to dos
     */
    private ToDo[] growArray(ToDo[] todos){
        todos = Arrays.copyOf(todos, count*2);
        return todos;
    }

    /**
     * creates a new iterator
     * @return new iterator
     */
    public ToDoIterator createIterator(){
        ToDoIterator myIterator = new ToDoIterator(todos);
        return myIterator;
    }

    /**
     * gets address
     * @return string with address
     */
    public String getAddress(){
        return this.address;
    }

    /**
     * does calculations to get the total cost of the to do
     * @return double that is the total cost
     */
    public double getTotalCost(){
        double total = 0;
        for(ToDo t : todos){
            if(t!=null){
                total += t.getPrice();
            }
        }
        return total;
    }
}
