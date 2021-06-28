package com.company;

public class Main {

    public static void main(String[] args) {
	Animal szarik = new Animal("feline");
	szarik.name = "szarik";
	System.out.println(szarik.weight); // Weight = 2.0
	szarik.feed(); // Weight = 3.0
	szarik.takeForAWalk(); // Weight = 3.0 - 1.5
	szarik.takeForAWalk(); // Weight = 1.5 - 1.5
	szarik.takeForAWalk(); // Weight =0.0
	szarik.feed(); // Weight = 0.0

    }
}
