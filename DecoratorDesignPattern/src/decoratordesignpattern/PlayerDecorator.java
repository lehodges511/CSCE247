package decoratordesignpattern;

/**
 * allows players to be upgraded
 * @author Lauren Hodges
 */
abstract class PlayerDecorator extends Player {
    abstract public String toString();
    abstract public double getPower();
}
