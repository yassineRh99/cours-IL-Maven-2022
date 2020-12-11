package fr.imt.coffee.machine;

import fr.imt.coffee.storage.cupboard.container.CoffeeCup;
import fr.imt.coffee.storage.cupboard.container.Cup;

public class CoffeeMachine {
    private final WaterTank waterTank;
    private final WaterPump waterPump;
    private final ElectricalResistance electricalResistance;
    private boolean isPlugged;
    private int nbCoffeeMade;

    public CoffeeMachine(double minWaterTank, double maxWaterTank, double pumpingCapacity){
        this.waterTank = new WaterTank(0, minWaterTank, maxWaterTank);
        this.waterPump = new WaterPump(pumpingCapacity/3600); //Liters per seconds 0.017
        this.electricalResistance = new ElectricalResistance(1000);
        this.isPlugged = false;
        this.nbCoffeeMade = 0;
    }

    public void plugToElectricalPlug(){
        isPlugged = true;
    }

    public void addWaterInTank(double waterVolume){
        this.waterTank.increaseWaterVolume(waterVolume);
    }

    public CoffeeCup makeACoffee(Cup cup, String coffeeType) throws LackOfWaterInTankException, InterruptedException {
        if(!isPlugged){
            throw new LackOfWaterInTankException("You must plug your coffee machine to an electrical plug.");
        }

        if (waterTank.getActualCapacity() < cup.getCapacity()){
            throw new LackOfWaterInTankException("You must add more water in the water tank.");
        }

        if (!cup.isEmpty()){
            throw new LackOfWaterInTankException("You must add more water in the water tank.");
        }

        electricalResistance.waterHeating(cup.getCapacity());
        waterPump.pumpWater(cup.getCapacity(), waterTank);
        nbCoffeeMade += 1;
        return new CoffeeCup(cup,coffeeType);
    }

    public String toString(){
        return "Your coffee machine has : \n" +
        "- water tank : " + waterTank.toString() + "\n" +
        "- water pump : " + waterPump.toString() + "\n" +
        "- electrical resistance : " + electricalResistance + "\n" +
        "- is plugged : " + isPlugged + "\n"+
        "and made " + nbCoffeeMade + " coffees";
    }
}
