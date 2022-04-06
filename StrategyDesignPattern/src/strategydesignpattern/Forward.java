/**
 * Lauren Hodges
 * class allows object forward to be created in driver
 */
package strategydesignpattern;
import java.util.Random;

public class Forward extends Player {
    public Forward(String name){
        /**
         * calls attribute from parent class
         */
        super(name);
    }

    public void setDefenceBehavior(){
        /**
         * uses random number generator to assign one of two defence behaviors for forward
         */
        Random r = new Random();
        int rand = r.nextInt(2);
        if(rand==0)
            this.defenceBehavior = new ChasePuckBehavior();
        else
            this.defenceBehavior = new BlockBehavior();
    }

    public void setOffenceBehavior(){
        /**
         * uses random number generator to assign one of two offence behaviors for forward
         */
        Random r = new Random();
        int rand = r.nextInt(2);
        if(rand==0){
            this.offenceBehavior=new ShootBehavior();
        }
        else
            this.offenceBehavior=new PassBehavior();
    }


    public String toString(){
        /**
         * returns statement saying who the forward is
         */
        return name + " plays the position: Forward";
    }


}
