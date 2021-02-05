package factorydesignpattern;

public class KidsBike extends Bike{
    public KidsBike() {
        name = "KidsBike";
        price = 80.99;
        numOfWheels = 2;
        hasPedals = true;
        hasTrainingWheels = true;
    }
}
