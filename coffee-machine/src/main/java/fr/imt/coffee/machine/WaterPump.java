package fr.imt.coffee.machine;

public class WaterPump {

    private final double pumpingCapacity;

    public WaterPump(double pumpingCapacity){
        this.pumpingCapacity = pumpingCapacity;
    }

    public void pumpWater(double waterVolume, WaterTank waterTank) throws InterruptedException {
        double pumpingTime = waterVolume / pumpingCapacity;
        System.out.println("Pumping time : "  +  pumpingTime);
        Thread.sleep((long) (pumpingTime * 1000));
        waterTank.decreaseWaterVolume(waterVolume);
    }
}
