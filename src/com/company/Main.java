package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
		FarmAnimal dog = new FarmAnimal("wilczur");
		Pet cat = new Pet("dachowiec");
		cat.feed();
		cat.feed(10.0);
		dog.feed();
		dog.feed(12.0);
		dog.beEaten();
		cat.beEaten();
    }

}
