package fr.imt.coffee;

import fr.imt.coffee.storage.cupboard.ExceptionContainerCreation;
import fr.imt.coffee.storage.cupboard.FabricCupboardContainer;
import fr.imt.coffee.storage.cupboard.container.CoffeeCup;
import fr.imt.coffee.storage.cupboard.container.Cup;
import fr.imt.coffee.machine.CoffeeMachine;
import fr.imt.coffee.machine.LackOfWaterInTankException;

public class MainCoffee {
    public static void main(String[] args) {
        FabricCupboardContainer fabricCupboardContainer = FabricCupboardContainer.getFabricContainerInstance();
        CoffeeMachine coffeeMachine = new CoffeeMachine(0.25, 3, 600);

        coffeeMachine.plugToElectricalPlug();
        coffeeMachine.addWaterInTank(2);

        System.out.println(coffeeMachine.toString());

        Cup cup = null;
        CoffeeCup coffeeCup = null;

        try {
            cup = (Cup) fabricCupboardContainer.getContainer("cup",0.25);
            coffeeCup = coffeeMachine.makeACoffee(cup,"Arabica");
            System.out.println(coffeeCup.toString());
        } catch (LackOfWaterInTankException | InterruptedException | ExceptionContainerCreation e) {
            e.printStackTrace();
        }

    }
}
