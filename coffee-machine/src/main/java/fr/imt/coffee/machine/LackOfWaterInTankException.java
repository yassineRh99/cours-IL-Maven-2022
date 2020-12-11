package fr.imt.coffee.machine;

public class LackOfWaterInTankException extends Exception{
    public LackOfWaterInTankException(String message) {
        super(message);
    }
}
