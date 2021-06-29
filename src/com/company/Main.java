package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;

public class Main {

    public static <Lpg> void main(String[] args) {
		Phone iphone = new Phone("Iphone","Se",2015,"IOS",5.4);
		iphone.installAnApp("react");
		iphone.installAnApp("react","8.9");
		iphone.installAnApp("react","8.9","www.adf.pl");
		ArrayList<String> list = new ArrayList<String>();
		list.add("good");
		list.add("notGood");
		iphone.installAnApp(list);

		Electric tesla = new Electric("S11","Tokyo",2019,"1.0","ksdin124",12000.0);
		Disel passat = new Disel("Passat","Germany",1992,"1.9TDI","mlmpgdfkgmk1",15000.0);
		LPG honda = new LPG("civic","Japonia",2002,"3.2","sdfsdg12dsf",32000.0);

		tesla.refuel();
		passat.refuel();
		honda.refuel();
    }

}
