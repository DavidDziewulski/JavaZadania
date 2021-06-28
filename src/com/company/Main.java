package com.company;

public class Main {

    public static void main(String[] args) {
    //Task1
//	Animal szarik = new Animal("feline");
//	szarik.name = "szarik";
//	System.out.println(szarik.weight); // Weight = 2.0
//	szarik.feed(); // Weight = 3.0
//	szarik.takeForAWalk(); // Weight = 3.0 - 1.5
//	szarik.takeForAWalk(); // Weight = 1.5 - 1.5
//	szarik.takeForAWalk(); // Weight =0.0
//	szarik.feed(); // Weight = 0.0


	// Task 2

	Phone iphone = new Phone("Iphone","Se","Ios",5.6);
	Car audi = new Car("Audi","A3","1.9Tdi","smkdsk1024124");
	Animal szarik = new Animal("feline");
	Human dawid = new Human("Dawid","Dziewulski","male",25,iphone,szarik);
	dawid.vehicle = audi;
	System.out.println(dawid.vehicle);
    }
}
