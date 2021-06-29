package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static  void main(String[] args) {
        Pet burek = new Pet("Kot");
        Phone iphone = new Phone("Apple","Se",2019,"ios",5.0);
        Human dawid = new Human("Dawid","Dziewulski","male",25,iphone,burek);
        dawid.setCash(300.0);
        Application app1 = new Application("lol","v2",100.0);
        Application app2 = new Application("cs1.6","v3",20.0);
        Application app3 = new Application("gta","v5",0.0);
        Set<Application> listOfApps = new HashSet<Application>();
        listOfApps.add(app1);
        listOfApps.add(app2);
        listOfApps.add(app3);
        iphone.install(app1,dawid);
        iphone.install(app2,dawid);
        System.out.println(dawid.getCash());
        iphone.isInstall(app1);
        iphone.isInstall(app2);
        iphone.isInstallByName("cs1.6");
        System.out.println(iphone.valueOfInstallApps());
        iphone.freeApp(listOfApps);
        iphone.sortByAlphabet();
        iphone.sortByValue();

    }

}
