package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {

//Task 6
		Car audi = new Car("Audi","A3","1.9Tdi","smkdsk1024124",10000.0);
		Car audi2 = new Car("Audi","A3","1.9Tdi","smkdsk1024124",10000.0);
		System.out.println(audi.equals(audi2));  // Przyjmimy że nie nadpisałem equals wtedy mamy  False - Dzieje się tak dlatego, że dwie referencje wskazujące na dwa różne obiekty nie są sobie równe.
		// Domyślna implementacja metody equals() sprowadza się jednak jedynie do porównania referencji ==,
		// czyli w większości przypadków nie jest zbyt użyteczna.
		// W klasach, których obiekty będziemy ze sobą porównywali powinniśmy ją nadpisać.
    	System.out.println(audi);
    	System.out.println(audi2);
    	System.out.println(audi.model.equals(audi2.model)); // Mamy true - ponieważ pola przechowuję takiego samego stringa ( "A3" == "A3")// True
		System.out.println(audi.equals(audi2)); // Tutaj gdy nadpisałem metodę equals w car działa poprawnie!

		Phone iphone = new Phone("Iphone","Se","Ios",5.6);
		Animal szarik = new Animal("feline");
		szarik.name = "szarik";
		Human dawid = new Human("Dawid","Dziewulski","male",25,iphone,szarik);

		System.out.println(iphone.toString());
		System.out.println(szarik.toString());
		System.out.println(dawid.toString());
    }

}
