package factorydesignpattern;

public abstract class Bike {
    protected String name;
    protected Double price;
    protected int numOfWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike() {

    }

    private void createFrame() {

    }

    private void addWheels() {

    }

    private void addPedals() {

    }

    public double getPrice() {
        return price;
    }
}