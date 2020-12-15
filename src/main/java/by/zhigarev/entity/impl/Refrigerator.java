package by.zhigarev.entity.impl;

import by.zhigarev.entity.KitchenDevice;

public class Refrigerator extends KitchenDevice {
    private double freezer_capacity;
    private double overall_capacity;

    public Refrigerator(double powerConsumption, double weight, double width, double height, double freezer_capacity, double overall_capacity) {
        super(powerConsumption, weight, width, height);
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
    }

    public double getFreezer_capacity() {
        return freezer_capacity;
    }

    public void setFreezer_capacity(double freezer_capacity) {
        this.freezer_capacity = freezer_capacity;
    }

    public double getOverall_capacity() {
        return overall_capacity;
    }

    public void setOverall_capacity(double overall_capacity) {
        this.overall_capacity = overall_capacity;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "freezer_capacity=" + freezer_capacity +
                ", overall_capacity=" + overall_capacity +
                super.toString()+
                '}';
    }
}
