package by.zhigarev.entity.implementation;

import by.zhigarev.entity.HomeDevice;
import by.zhigarev.entity.KitchenDevice;

import java.util.Scanner;

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


}
