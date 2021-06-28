package com.company;

public class Car {
    final public String model;
    final public String producer;
    final private String vin;
    public String motor;

    Car(  String producer, String model,String motor,String vin){
        this.producer = producer;
        this.model = model;
        this.motor = motor;
        this.vin = vin;
    }
}
