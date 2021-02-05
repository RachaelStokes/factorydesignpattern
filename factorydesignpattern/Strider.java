package factorydesignpattern;
/**
 * child class of bike that sets the attributes according to a strider
 * @author Rachael
 */
public class Strider extends Bike{

     /**
     * constructor method to set all values of the strider
     */
    public Strider() {
        name = "Strider"; //sets the name to strider
        price = 65.99; //sets the price to 65.99
        numOfWheels = 2; //sets the number of wheels to 2
        hasPedals = false; //sets the pedals to false
        hasTrainingWheels = false; //sets the training wheels to false
    }
}
