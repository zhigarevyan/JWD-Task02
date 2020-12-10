package by.zhigarev.entity.implementation;

import by.zhigarev.entity.HomeDevice;

import java.util.Scanner;

public class Refrigerator extends HomeDevice {
    private double freezerCapacity;
    private double overallCapacity;



    public Refrigerator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter freezerCapacity");
        freezerCapacity = scanner.nextDouble();
        System.out.println("Enter overallCapacity");
        overallCapacity = scanner.nextDouble();
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
