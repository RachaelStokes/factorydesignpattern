package factorydesignpattern;
/**
 * abstract class bike that creates all instance variables and the methods of the children classes
 * @author Rachael
 */
public abstract class Bike {
    protected String name; //String name of the bike
    protected Double price; //double price of the bike
    protected int numOfWheels; //int number of wheels on the bike
    protected boolean hasPedals; //boolean if the bike has pedals
    protected boolean hasTrainingWheels; //boolean if the bike has training wheels
 
    /**
     * method that calls the private createFrame, addWheels, and addPedals methods
     */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
    }

    /**
     * method that prints out that the name of the bike's frame is being assemble
     */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * method that prints that the bike has a certain amount of wheels if it isn't 0 and also prints if it has training wheels
     */
    private void addWheels() {
        if(numOfWheels != 0) {
            System.out.println("Adding " + numOfWheels + " wheel(s)");
            if(hasTrainingWheels) {
                System.out.println("Adding Training Wheels");
            }
        } 
    }

    /**
     * private methof that prints out if the bike has pedals
     */
    private void addPedals() {
        if(hasPedals) {
            System.out.println("Adding Pedals");
        }
    }

    /**
     * method that returns the double price of the bike
     * @return double price of the bike
     */
    public double getPrice() {
        return price;
    }
}