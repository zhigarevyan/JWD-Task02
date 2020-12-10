package by.zhigarev.entity;

import java.util.Scanner;

public class KitchenDevice extends HomeDevice{
    private double weight;
    private double width;
    private double height;

    public KitchenDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weight");
        weight = scanner.nextDouble();
        System.out.println("Enter Width");
        width = scanner.nextDouble();
        System.out.println("Enter height");
        height = scanner.nextDouble();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
