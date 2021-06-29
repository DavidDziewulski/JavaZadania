package devices;

public class Phone {
    String producer;
    String model;
    String operationSystem;
    Double screenSize;

    public Phone( String producer, String model, String operationSystem, Double screenSize){
        this.model = model;
        this.producer = producer;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }


    String getOsVersion(){
        return "5.32.1";
    }
    @Override
    public String toString(){//overriding the toString() method
        return "Producer:"+this.producer+"Model:"+this.model+"OperationSystem:"+this.operationSystem+"ScreenSize:"+this.screenSize;
    }
}
