package devices;

import com.company.Human;
import com.company.Salleable;

public class Phone extends Device implements Salleable {
    String producer;
    String model;
    String operationSystem;
    Double screenSize;
    Integer yearOfProduction;

    public Phone( String producer, String model,Integer yearOfProduction, String operationSystem, Double screenSize){
        super(model,producer,yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }


    String getOsVersion(){
        return "5.32.1";
    }

    public void turnOn(){
        System.out.println("Telefon został włączony");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPhone() == null){
            System.out.println("Niestety sprzedający nie ma telefonu");
        }
        else{
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setPhone(null);
                buyer.setPhone(seller.getPhone());
                System.out.println("Kupujący kupił telefon");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }
    }
}
