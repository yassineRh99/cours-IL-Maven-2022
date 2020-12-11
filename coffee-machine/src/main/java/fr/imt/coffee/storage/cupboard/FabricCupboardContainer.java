package fr.imt.coffee.storage.cupboard;

import fr.imt.coffee.storage.cupboard.container.Container;
import fr.imt.coffee.storage.cupboard.container.Cup;
import fr.imt.coffee.storage.cupboard.container.Mug;

public class FabricCupboardContainer {

    private static FabricCupboardContainer instance = new FabricCupboardContainer();

    private FabricCupboardContainer() { }

    public static FabricCupboardContainer getFabricContainerInstance() {
        return instance;
    }

    public Container getContainer(String typeContainer, double capacity) throws ExceptionContainerCreation {
        if (typeContainer.equals("mug"))
            return new Mug(capacity);
        else if (typeContainer.equals("cup"))
            return new Cup(capacity);
        else
            throw new ExceptionContainerCreation("Container not available in the storage cupboard : " + typeContainer);
    }
}
