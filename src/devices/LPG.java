package devices;

import com.company.Human;

public class LPG extends Car {
    public LPG(String producer, String model, Integer yearOfProduction, String motor, String vin, Double value, Human owner) {
        super(producer, model, yearOfProduction, motor, vin, value, owner);
    }

    @Override
    public void refuel() {
        System.out.println("Tankowanie!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
