package devices;

public class Phone extends Device {
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
}
