package devices;
public class Car {
    final public String model;
    final public String producer;
    final private String vin;
    public String motor;
    public Double value;

    public Car(  String producer, String model,String motor,String vin,Double value){
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
    @Override
    public String toString(){//overriding the toString() method
        return "Model:"+this.model+"Producer:"+this.producer+"Vin:"+this.vin+ "Motor:"+this.motor+"Value:"+this.value;
    }

}
