package by.zhigarev.entity.impl;

import by.zhigarev.entity.WorkDevice;

import java.awt.*;

public class TabletPC extends WorkDevice {
    private double flash_memory_capacity;
    private String color;

    public TabletPC(double batteryCapacity, double memoryRom, double displayInches, double flash_memory_capacity, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'' +
                super.toString()+
                '}';
    }
}
