package com.company;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;
    Phone mobilePhone;
    Animal pet;
    Double cash;
    public Car[] garage;
    private Double salary;

    public Human(String firstName, String lastName, String sex, Integer age, Phone mobilePhone, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.mobilePhone = mobilePhone;
        this.pet = pet;
        this.garage = new Car[2];
    }
    public Human(String firstName, String lastName, String sex, Integer age, Phone mobilePhone, Animal pet, Integer vehicles, Car [] listOfVehicles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.mobilePhone = mobilePhone;
        this.pet = pet;
        this.garage = new Car[vehicles];
        this.garage = listOfVehicles;
    }

    public double getSalary() {
        Date date = new Date();
        System.out.println(date); // Informacje o dacie
        System.out.println(this.salary + "$"); //Informacje ile było kasy
        return this.salary; // Zwraca zarobki
    }

    public void setSalary(Double new_sallary) {
        if (new_sallary < 0.0) {
            System.out.println("Chcesz zarabiać mniej niż 0$?");
        } else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Odbierz aneks do umowy od pani Hani");
            System.out.println("Zus i Us już wiedzą o zmianie wypłaty");
            this.salary = new_sallary;
        }


    }
    public Car getCar(Integer place_num){
        return this.garage[place_num];
    }
    public void setCar(Car new_car, Integer place_num){
       this.garage[place_num] = new_car;
    }
    public void setPet(Animal new_pet){
        this.pet = new_pet;

    }
    public Animal getPet(){
        return this.pet;
    }
    public void setPhone(Phone new_phone){
        this.mobilePhone = new_phone;
    }
    public Phone getPhone(){
        return this.mobilePhone;
    }
    public void setCash(Double new_cash){
        this.cash = new_cash;
    }
    public Double getCash(){
        return this.cash;
    }
    public String toString(){//overriding the toString() method
        return "FirstName:"+this.firstName+"LastName:"+this.lastName+"Sex:"+this.sex+"Age"+this.age;
    }
    public Double calculatedValue (){
        Double result = 0.0;
        for(Car auto:garage){
            result+=auto.getValue();
        }
        return result;
    }
       public void sortByYear(){
            Car temp;
            int zmiana = 1;
            while(zmiana > 0){
                zmiana = 0;
                for(int i=0; i<this.garage.length-1; i++){
                    if(this.garage[i].yearOfProduction>this.garage[i+1].yearOfProduction){
                        temp = garage[i+1];
                        garage[i+1] = garage[i];
                        garage[i] = temp;
                        zmiana++;
                    }
                }
            }
    System.out.println("Posortowane!");
        }

    }
