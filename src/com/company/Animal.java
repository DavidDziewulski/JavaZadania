package com.company;

public class Animal implements Salleable {
    String name;
    final String species;
    Double weight;
    static final public Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public Animal(String species) {
        this.species = species;
        switch(this.species){
            case "canis familiaris" :
                this.weight = 10.0;
                break;
            case "feline" :
                this.weight = 2.0;
                break;
            default: this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public void feed(){
        if(this.weight == 0.0){
            System.out.println("Niestety zwięrze nie żyje nie możesz nakarmić nie żyjącego zwierzaka ? Bro!!");
            return;
        }
        this.weight += 1.0;
        System.out.println("Dziękuje za jedzenie");
    }

    public void takeForAWalk(){
        if(this.weight == 0.0){
            System.out.println("Niestety zwięrze nie żyje!");
            return;
        }else if(this.weight == 1.5){
            System.out.println("To był jego ostatni spacer :( ");
            this.weight -= 1.5;
            return;
        }
        this.weight -= 1.5;
        System.out.println("Dziękuje za spacer");
    }
    @Override
    public String toString(){//overriding the toString() method
        return "Name:"+this.name+"Species:"+this.species+"Weight:"+this.weight;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPet() == null){
            System.out.println("Niestety sprzedający nie ma zwierzaka");
        }
        else{
            if(buyer.getCash() >= price){
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                seller.setPet(null);
                buyer.setPet(seller.getPet());
                System.out.println("Kupujący kupił zwierzę");
            }
            else{
                System.out.println("Niestety nie masz tyle kasy");
            }
        }

    }
}
