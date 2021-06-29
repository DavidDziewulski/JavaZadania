package creatures;



public class Pet extends Animal implements Edbile {
    public Pet(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println(this.weight);
    }
}
