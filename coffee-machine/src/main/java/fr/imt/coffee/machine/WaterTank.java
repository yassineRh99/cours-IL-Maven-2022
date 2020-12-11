package fr.imt.coffee.machine;

public class WaterTank {
    private double maxCapacity;
    private double minCapacity;
    private double actualCapacity;

    public WaterTank(double initialCapacity, double minCapacity, double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
        this.actualCapacity = initialCapacity;
    }

    public void decreaseWaterVolume(double waterVolumeToDecrease){
        this.actualCapacity -= waterVolumeToDecrease;
    }

    public void increaseWaterVolume(double waterVolumeToIncrease){
        this.actualCapacity += waterVolumeToIncrease;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getMinCapacity() {
        return minCapacity;
    }

    public double getActualCapacity() {
        return actualCapacity;
    }
}

