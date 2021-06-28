package com.company;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;
    Phone mobilePhone;
    Animal pet;
    private Car vehicle;
    private Double salary;

    public Human(String firstName, String lastName, String sex, Integer age, Phone mobilePhone, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.mobilePhone = mobilePhone;
        this.pet = pet;
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
    public Car getCar(){
        return this.vehicle;
    }
    public void setCar(Car new_car){
        if(new_car.value <= this.salary){
            System.out.println("Zarabiasz dużo więc i fura jest!");
        }else if(new_car.value/12 <= this.salary){
            System.out.println("Udało się kupić auto na kredyt -_-");
        }else{
            System.out.println("Stary idź na studia albo po podwyżkę bo nie będziesz miał auta nigdy!");
        }
    }
}