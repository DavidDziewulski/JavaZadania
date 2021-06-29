package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;

public class Main {

    public static  void main(String[] args) {
		Phone iphone = new Phone("Iphone","Se",2015,"IOS",5.4);
		Disel passat = new Disel("Passat","Germany",2005,"1.9TDI","mlmpgdfkgmk1",15000.0);
		LPG honda = new LPG("civic","Japonia",2002,"3.2","sdfsdg12dsf",32000.0);
		Pet szarik = new Pet("felies");
		Car[] lista = {passat,honda};
        Human dawid = new Human("Dawid","dz","male",25,iphone,szarik,2,lista);
		Human bartek = new Human("Bartek","dz","male",25,iphone,szarik);
		dawid.setCash(1000.00);
		bartek.setCash(2000.0);
//		System.out.println(dawid.garage[0]);
//		System.out.println(dawid.garage[1]);
        dawid.sortByYear(); // Sortuje
//		System.out.println(dawid.garage[0]); // Sprawdzam czy dobrze posortowało
//		System.out.println(dawid.garage[1]); // Sprawdzam czy dobrze posortowało
//		System.out.println(dawid.calculatedValue()); // Wypisuje wartość Aut w Garażu
		passat.sell(dawid,bartek,100.00,passat);
		passat.sell(dawid,bartek,100.0,passat);


    }

}
