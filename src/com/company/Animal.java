package com.company;

public class Animal {
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
}
