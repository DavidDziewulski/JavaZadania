package devices;
import com.company.Human;
import com.company.Salleable;
public abstract class Car extends Device implements Salleable {
    final public String model;
    final public String producer;
    final private String vin;
    public String motor;
    public Double value;
    Integer yearOfProduction;

    public Car(  String producer, String model,Integer yearOfProduction,String motor,String vin,Double value){
        super(model,producer,yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.motor = motor;
        this.vin = vin;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Double epsilon = 0.1;
        Car other = (Car) obj;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(this.producer != other.producer)
            return false;
        if(this.model !=other.model)
            return false;
        if(this.motor != other.motor)
            return false;
        if(this.vin != other.vin)
            return false;
        if(Math.abs(this.value - other.value) > epsilon)
            return false;
        else
            return true;
    }
    public void turnOn(){
        System.out.println("Samochód został odpalony!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() == null){
            System.out.println("Niestety sprzedający nie ma auta");
        }
        else{
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setCar(null);
                buyer.setCar(seller.getCar());
                System.out.println("Kupujący kupił auto");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }

    }

    public abstract void refuel();
}

