package by.zhigarev.entity.implementation;

import by.zhigarev.entity.WorkDevice;
import by.zhigarev.entity.enums.Os;

import java.awt.*;
import java.util.Scanner;

public class TabletPC extends WorkDevice {
    private double flashMemoryCapacity;
    private Color color;

    public TabletPC() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Color: \n0 - Red\n1 - Green\n3 - Blue");
        switch (scanner.nextInt()){
            case 0:
                color = Color.RED;
                break;
            case 1:
                color = Color.GREEN;
                break;
            case 3:
                color = Color.BLUE;
                break;
        }
        System.out.println("Enter FlashMemory");
        flashMemoryCapacity = scanner.nextDouble();
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
