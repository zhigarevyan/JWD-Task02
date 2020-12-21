package by.zhigarev.entity.impl;

import by.zhigarev.entity.WorkDevice;

public class Laptop extends WorkDevice {
    private String os;
    private double systemMemory;
    private double cpu;

    public Laptop(double batteryCapacity, double memoryRom, double displayInches, String os, double systemMemory, double cpu) {
        super(batteryCapacity, memoryRom, displayInches);
        this.os = os;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os=" + os +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", battery capacity=" + super.getBatteryCapacity() +
                ", displayInches=" + super.getDisplayInches() +
                ", MemoryRom=" + super.getMemoryRom() +
                '}';
    }
}
