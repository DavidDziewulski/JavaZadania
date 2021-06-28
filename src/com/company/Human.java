package com.company;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    String sex;
    Integer age;
    Phone mobilePhone;
    Animal pet;
    Car vehicle;
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
}