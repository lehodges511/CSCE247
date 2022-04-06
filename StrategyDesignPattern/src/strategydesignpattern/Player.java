/**
 * Lauren Hodges
 * class creates an object, Player, that is then assigned a name, a position, and a behavior depending on offence or defence
 */
package strategydesignpattern;
public abstract class Player {

    //attributes
    protected String name;
    private boolean offense = true;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;


    public Player(String name){
        /**
         * giving values to attributes
         */
        this.name=name;
        setDefenceBehavior();
        setOffenceBehavior();
    }
    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();

    public String play(){
        /**
         * returns the type of play that the player is doing
         */
        if(offense){
            return this.offenceBehavior.play();
        }
        else
            return this.defenceBehavior.play();

    }

    public void turnover(){
        /**
         * determines if player does offence behavior or defence behavior
         */
        this.offense=!this.offense;
    }






}
