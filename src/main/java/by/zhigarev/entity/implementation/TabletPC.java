package by.zhigarev.entity.implementation;

import by.zhigarev.entity.WorkDevice;
import by.zhigarev.entity.enums.Os;

import java.awt.*;
import java.util.Scanner;

public class TabletPC extends WorkDevice {
    private double flashMemoryCapacity;
    private Color color;

    public TabletPC(double batteryCapacity, double memoryRom, double displayInches, double flashMemoryCapacity, Color color) {
        super(batteryCapacity, memoryRom, displayInches);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
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
