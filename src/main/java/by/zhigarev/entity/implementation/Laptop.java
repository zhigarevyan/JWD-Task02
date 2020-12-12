package by.zhigarev.entity.implementation;

import by.zhigarev.entity.enums.Os;
import by.zhigarev.entity.WorkDevice;

public class Laptop extends WorkDevice {
    private Os os;
    private double system_memory;
    private double cpu;

    public Laptop(double batteryCapacity, double memoryRom, double displayInches, Os os, double system_memory, double cpu) {
        super(batteryCapacity, memoryRom, displayInches);
        this.os = os;
        this.system_memory = system_memory;
        this.cpu = cpu;
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public double getSystem_memory() {
        return system_memory;
    }

    public void setSystem_memory(double system_memory) {
        this.system_memory = system_memory;
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
                ", systemMemory=" + system_memory +
                ", cpu=" + cpu +
                '}';
    }
}
