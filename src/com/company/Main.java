package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;

public class Main {

    public static  void main(String[] args) {
		Phone iphone = new Phone("Iphone","Se",2015,"IOS",5.4);
		Pet szarik = new Pet("felies");
        Human dawid = new Human("Dawid","dz","male",25,iphone,szarik);
		Human bartek = new Human("Bartek","dz","male",25,iphone,szarik);
		Disel passat = new Disel("Passat","Germany",2005,"1.9TDI","mlmpgdfkgmk1",15000.0,dawid);
		LPG honda = new LPG("civic","Japonia",2002,"3.2","sdfsdg12dsf",32000.0,bartek);
		dawid.setCash(1000.00);
		bartek.setCash(2000.0);
		dawid.setCar(passat,0);
		passat.sell(dawid,bartek,100.00,passat);
		passat.sell(bartek,dawid,100.0,passat);
		passat.checkOwners();
		passat.checkIfASelB(dawid,bartek);
		passat.checkIfASelB(bartek,dawid);
		passat.amountOfSell();

    }

}
