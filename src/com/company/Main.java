package com.company;

public class Main {

    public static void main(String[] args) {
	//Task 3
	Phone iphone = new Phone("Iphone","Se","Ios",5.6);
	Car audi = new Car("Audi","A3","1.9Tdi","smkdsk1024124",10000.0);
	Animal szarik = new Animal("feline");
	Human dawid = new Human("Dawid","Dziewulski","male",25,iphone,szarik);
	dawid.setSalary(200.0);
	dawid.setCar(audi);

	dawid.setSalary(2000.0);
	dawid.setCar(audi);

	dawid.setSalary(12000.0);
	dawid.setCar(audi);
    }
}
