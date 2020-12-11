package fr.imt.coffee.storage.cupboard.container;

public class CoffeeCup extends Cup{

    private final String coffeeType;

    public CoffeeCup(double capacity, String coffeeType) {
        super(capacity);
        this.coffeeType = coffeeType;
    }

    public CoffeeCup(Cup cup, String coffeeType) {
        super(cup.getCapacity());
        this.setEmpty(false);
        this.coffeeType = coffeeType;
    }

    public String toString(){
        return super.toString() + "\n" + "Coffee type : " + coffeeType;
    }
}
