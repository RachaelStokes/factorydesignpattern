package factorydesignpattern;

/**
 * class bike store creates and orders the bikes 
 * @author Rachael 
 */
public class BikeStore {

    /**
     * public method returns the private createBike method using parameter type
     * @param type the string type of the bike
     * @return Bike the created bike from the string
     */
    public Bike orderBike(String type) {
        return createBike(type);
    }

    /**
     * private method returns a bike created based on what type it is and prints the price
     * @param type the string type of the bike
     * @return Bike the bike created
     */
    private Bike createBike(String type) {
        Bike bike;
        if (type.equals("tricycle")) {
            bike = new Tricycle();
        } else if (type.equals("strider")) {
            bike = new Strider();
        } else {
            bike = new KidsBike();
        }
        bike.createBike();
        System.out.println("Price $" + bike.getPrice());
        return bike;

    }
}
