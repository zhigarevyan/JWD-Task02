package by.zhigarev.entity.implementation;

import by.zhigarev.entity.HomeDevice;
import by.zhigarev.entity.KitchenDevice;

import java.util.Scanner;

public class Oven extends KitchenDevice {
    private double capacity;
    private double depth;

    public Oven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity");
        capacity = scanner.nextDouble();
        System.out.println("Enter depth");
        depth = scanner.nextDouble();
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
