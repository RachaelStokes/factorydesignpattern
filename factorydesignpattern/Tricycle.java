package factorydesignpattern;
/**
 * child class of bike that sets the attributes according to a tricycle
 * @author Rachael
 */
public class Tricycle extends Bike {

    /**
     * constructor method to set all values of the tricycle
     */
    public Tricycle() {
        name = "Tricycle"; //sets the name of the bike to tricycle
        price = 54.95; //sets the price to 54.95
        numOfWheels = 3; //sets the number of wheels to 3
        hasPedals = true; //sets the pedals to true
        hasTrainingWheels = false; //sets the training wheels to false
    }
}
