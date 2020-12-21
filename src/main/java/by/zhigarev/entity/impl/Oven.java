package by.zhigarev.entity.impl;

import by.zhigarev.entity.KitchenDevice;

public class Oven extends KitchenDevice {
    private double capacity;
    private double depth;

    public Oven(double powerConsumption, double weight, double width, double height, double capacity, double depth) {
        super(powerConsumption, weight, width, height);
        this.capacity = capacity;
        this.depth = depth;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + super.getHeight() +
                ", powerConsumption=" + super.getPowerConsumption() +
                ", weight=" + super.getWeight() +
                ", width=" + super.getWidth() +
                '}';
    }
}
