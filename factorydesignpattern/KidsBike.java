package factorydesignpattern;
/**
 * child class of bike that sets the attributes according to a kid's bike
 * @author Rachael
 */
public class KidsBike extends Bike{
    
    /**
     * constructor method to set all values of the kid's bike
     */
    public KidsBike() {
        name = "KidsBike"; //sets the name of the bike to "kidsbike"
        price = 80.99; //sets the price of the bike to 80.99
        numOfWheels = 2; //sets the number of wheels to 2
        hasPedals = true; //sets the pedals to true
        hasTrainingWheels = true; //sets the training wheels to true
    }
}
