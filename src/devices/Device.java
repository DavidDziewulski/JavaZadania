package devices;

public abstract class Device {
    final public String model;
    final public String producer;
    final public Integer yearOfProduction;
    public abstract void turnOn();

    protected Device(String model, String producer, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public String toString(){//overriding the toString() method
        return "Producer:"+this.producer+"Model:"+this.model+"Year Of Production"+this.yearOfProduction;
    }
}
