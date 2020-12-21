package by.zhigarev.entity.impl;

import by.zhigarev.entity.KitchenDevice;

public class Refrigerator extends KitchenDevice {
    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator(double powerConsumption, double weight, double width, double height, double freezerCapacity, double overallCapacity) {
        super(powerConsumption, weight, width, height);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "freezer_capacity=" + freezerCapacity +
                ", overall_capacity=" + overallCapacity +
                super.toString()+
                '}';
    }
}
