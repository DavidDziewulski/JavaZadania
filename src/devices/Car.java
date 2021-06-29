package devices;
import com.company.Human;
import com.company.Salleable;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public abstract class Car extends Device implements Salleable {
    final private String vin;
    public String motor;
    final public Double value;
    public List<Human> owners = new ArrayList<Human>();

    public Car(String producer, String model, Integer yearOfProduction, String motor, String vin, Double value,Human owner) {
        super(model, producer, yearOfProduction);
        this.motor = motor;
        this.vin = vin;
        this.value = value;
        owners.add(owner);
    }

    @Override
    public boolean equals(Object obj) {
        Double epsilon = 0.1;
        Car other = (Car) obj;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.producer != other.producer)
            return false;
        if (this.model != other.model)
            return false;
        if (this.motor != other.motor)
            return false;
        if (this.vin != other.vin)
            return false;
        if (Math.abs(this.value - other.value) > epsilon)
            return false;
        else
            return true;
    }

    public void turnOn() {
        System.out.println("Samochód został odpalony!");
    }


    public void sell(Human seller, Human buyer, Double price, Car vehicle) {
        if (Arrays.asList(seller.garage).contains(vehicle)) {
            if (Arrays.asList(buyer.garage).contains(null)) {
                if (buyer.getCash() >= price) {
                    if(vehicle.owners.get(vehicle.owners.size() -1).equals(seller)){ // Sprawdzam czy w ostatni jest sprzedający
                        Integer free_place = Arrays.asList(buyer.garage).indexOf(null);
                        buyer.garage[free_place] = vehicle; // Dodaje auto
                        Integer remove_auto = Arrays.asList(seller.garage).indexOf(vehicle);
                        seller.garage[remove_auto] = null; // Usuwam auto
                        seller.setCash(seller.getCash() + price); // Kasa dla sprzedającego
                        buyer.setCash(buyer.getCash() - price); // Kasa dla kupującego
                        System.out.println("Tranzakcja zakończona sukcesem!");
                        owners.add(buyer);
                    }else{
                        System.out.println("Niestety kupujący nie jest ostatnim właścicielem");
                    }

                } else {

                    System.out.println("Nie ma kasy");
                }
            }else{
                System.out.println("Kupujący Nie ma miejsca");
            }
        } else {
            System.out.println("Sprzedawca nie posiada auta");
        }
    }
        public abstract void refuel ();
        public Double getValue ()
        {
            return this.value;
        }

    public void checkOwners(){
            if(owners.size() >0){
                System.out.println("Auto posiada właściciela");
            }else{
                System.out.println("Auto nigdy nie posiadało właściciela ");
            }

    }

    public  void checkIfASelB (Human seller, Human buyer){
            Integer place_seller = this.owners.indexOf(seller);
            Integer place_buyer = this.owners.indexOf(buyer);
            if(place_seller < place_buyer){
                System.out.println("Tak pierwszy człowiek sprzedał drugiemu auto");
            }else{
                System.out.println("Niestety pierwszy człowiek nie mógł sprzedać drugiemu bo nie był pierwszym właścicielem");
            }
    }
    public void amountOfSell(){
        System.out.println(this.owners.size()-1);
    }

}


