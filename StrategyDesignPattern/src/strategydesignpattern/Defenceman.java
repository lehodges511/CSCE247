/**
 * Lauren Hodges
 * class allows object "Defenceman" to be created in driver
 */
package strategydesignpattern;
import java.util.Random;

public class Defenceman extends Player {
    public Defenceman(String name){
        /**
         * calls name from parent class
         */
        super(name);
    }

    public void setDefenceBehavior(){
        /**
         * uses random number generator to assign one of two random defence behaviors to the defenceman
         */
        Random r = new Random();
        int rand = r.nextInt(2);
        if(rand==0)
            this.defenceBehavior=new ChasePuckBehavior();
        else
            this.defenceBehavior=new BlockBehavior();
    }

    public void setOffenceBehavior(){
        /**
         * uses random number generator to assign one of two offence behaviors to the defenceman
         */
        Random r = new Random();
        int rand = r.nextInt(2);
        if(rand==0)
            this.offenceBehavior = new PassBehavior();
        else
            this.offenceBehavior = new SlapShotBehavior();
    }

    public String toString(){
        /**
         * returns statement saying who the defenceman is
         */
        return name+" plays the position: Defenceman";
    }
}
