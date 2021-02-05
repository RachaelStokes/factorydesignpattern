package factorydesignpattern;

public abstract class Bike {
    protected String name;
    protected Double price;
    protected int numOfWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
    }

    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    private void addWheels() {
        if(numOfWheels != 0) {
            System.out.println("Adding " + numOfWheels + " wheel(s)");
            if(hasTrainingWheels) {
                System.out.println("Adding Training Wheels");
            }
        } 
    }

    private void addPedals() {
        if(hasPedals) {
            System.out.println("Adding Pedals");
        }
    }

    public double getPrice() {
        return price;
    }
}