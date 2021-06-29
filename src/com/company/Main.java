package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
		Car audi = new Car("Audi","A3",1999,"1.9TDI","sgsdgsdsg",1999.99);
		Car volvo = new Car("Volvo","Xc60",2015,"2.0TDI","gsdgdsg12sdf",20000.0);
		Phone iphone = new Phone("Iphone","Se",2019,"IOS",5.6);
		Phone samsung = new Phone("Samsung","S6",2012,"Android",6.0);
		System.out.println(audi.toString());
		System.out.println(iphone.toString());
		audi.turnOn();
		iphone.turnOn();
		Animal szarik = new Animal("feline");
		szarik.name = "Szarik";
		Animal lusi = new Animal("feline");
		szarik.name = "Lusi";
		Human dawid = new Human("Dawid","Dziewulski","Male",25,iphone,szarik);
		dawid.setSalary(50000.0);
		dawid.setCar(audi);
		Human bartek = new Human("Bartek","Puzio","Male",21,iphone,lusi);
		bartek.setSalary(30000.0);
		bartek.setCar(volvo);
		dawid.setCash(15000.0);
		bartek.setCash(12000.0);
		szarik.sell(dawid,bartek,10000.0);
		System.out.println(bartek.getCash());
		audi.sell(dawid,bartek,2000.00);
		iphone.sell(bartek,dawid,100000.0);
		// Nie można handlować ludźmi ponieważ nie jest zaimplementowany interfejs oraz nie ma tej metody !!

    }

}
