package fr.imt.coffee.storage.cupboard.container;

public class Container {
    private double capacity;
    private boolean isEmpty;

    public Container(double capacity){
        this.capacity = capacity;
        isEmpty = false;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String toString(){
        return "Container capacity : " + capacity + "\n" + "is empty : " + isEmpty;
    }
}
