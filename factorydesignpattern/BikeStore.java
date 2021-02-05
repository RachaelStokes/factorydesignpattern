package factorydesignpattern;

public class BikeStore {
    public Bike orderBike(String type) {
        return createBike(type);
    }
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
        return bike;

    }
}
