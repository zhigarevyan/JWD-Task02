package by.zhigarev.entity.implementation;

import by.zhigarev.entity.WorkDevice;

import java.awt.*;

public class TabletPC extends WorkDevice {
    private double flash_memory_capacity;
    private Color color;

    public TabletPC(double batteryCapacity, double memoryRom, double displayInches, double flash_memory_capacity, Color color) {
        super(batteryCapacity, memoryRom, displayInches);
        this.flash_memory_capacity = flash_memory_capacity;
        this.color = color;
    }

    public double getFlash_memory_capacity() {
        return flash_memory_capacity;
    }

    public void setFlash_memory_capacity(double flash_memory_capacity) {
        this.flash_memory_capacity = flash_memory_capacity;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
