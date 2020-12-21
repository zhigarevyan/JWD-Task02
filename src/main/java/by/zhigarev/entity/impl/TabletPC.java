package by.zhigarev.entity.impl;

import by.zhigarev.entity.WorkDevice;

public class TabletPC extends WorkDevice {
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(double batteryCapacity, double memoryRom, double displayInches, double flashMemoryCapacity, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "flash_memory_capacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                super.toString()+
                '}';
    }
}
