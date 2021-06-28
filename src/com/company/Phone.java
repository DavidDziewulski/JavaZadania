package com.company;

public class Phone {
    String producer;
    String model;
    String operationSystem;
    Double screenSize;

    Phone( String producer, String model, String operationSystem, Double screenSize){
        this.model = model;
        this.producer = producer;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }


    String getOsVersion(){
        return "5.32.1";
    }
}
