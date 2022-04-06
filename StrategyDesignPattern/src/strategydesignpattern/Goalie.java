/**
 * Lauren Hodges
 * class allows object Goalie to be created in driver
 */
package strategydesignpattern;

public class Goalie extends Player {
    public Goalie(String name){
        /**
         * calls attribute from parent class
         */
        super(name);
    }

    public void setDefenceBehavior(){
        /**
         * sets defence behavior to a block goal behavior
         */
        this.defenceBehavior = new BlockGoalBehavior();
    }

    public void setOffenceBehavior(){
        /**
         * sets offence behavior to a block goal behavior
         */
        this.offenceBehavior = new BlockGoalBehavior();
    }

    public String toString(){
        /**
         * returns statement saying who the goalie is
         */
        return name+" plays the position: Goalie";
    }

}
