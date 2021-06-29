package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
		Car audi = new Car("Audi","A3",1999,"1.9TDI","sgsdgsdsg",1999.99);
		Phone iphone = new Phone("Iphone","Se",2019,"IOS",5.6);
		System.out.println(audi.toString());
		System.out.println(iphone.toString());
		audi.turnOn();
		iphone.turnOn();

    }

}
