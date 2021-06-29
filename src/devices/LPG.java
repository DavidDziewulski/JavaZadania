package devices;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction, String motor, String vin, Double value) {
        super(producer, model, yearOfProduction, motor, vin, value);
    }

    @Override
    public void refuel() {
        System.out.println("Tankowanie!");
    }
}
