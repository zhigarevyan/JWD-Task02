package by.zhigarev.entity.implementation;

import by.zhigarev.entity.enums.Os;
import by.zhigarev.entity.WorkDevice;
import by.zhigarev.entity.enums.TypesOfDevice;

import java.util.Scanner;

public class Laptop extends WorkDevice {
    private Os os;
    private double systemMemory;
    private double cpu;

    public Laptop(double batteryCapacity, double memoryRom, double displayInches, Os os, double systemMemory, double cpu) {
        super(batteryCapacity, memoryRom, displayInches);
        this.os = os;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
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
                '}';
    }
}
