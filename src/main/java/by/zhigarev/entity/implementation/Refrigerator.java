package by.zhigarev.entity.implementation;

import by.zhigarev.entity.HomeDevice;
import by.zhigarev.entity.KitchenDevice;

import java.util.Scanner;

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


}
