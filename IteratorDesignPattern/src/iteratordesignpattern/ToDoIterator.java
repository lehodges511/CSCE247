package iteratordesignpattern;

/**
 * @author Lauren Hodges
 * is an iterator for the to do list
 */
public class ToDoIterator implements Iterator<ToDo> {
    private ToDo[] todos;
    private int position;

    /**
     * sets default constructors
     * @param todos list of to dos
     */
    public ToDoIterator(ToDo[] todos){
        this.todos = todos;
        position = 0;
    }

    /**
     * checks to see if the list of to dos has more to dos
     * @return boolean if list continues or not
     */
    public boolean hasNext(){
        if (position < todos.length && todos[position]!=null){
            return true;
        }
        return false;
    }

    /**
     * moves to next to do
     * @return the next position in the to do list
     */
    public ToDo next(){
        if(hasNext()){
            return todos[position++];
        }
        return null;
    }

}
