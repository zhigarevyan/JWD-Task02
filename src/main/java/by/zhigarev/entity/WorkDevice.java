package by.zhigarev.entity;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WorkDevice implements ElectroDevice {
    private double batteryCapacity;
    private double memoryRom;
    private double displayInches;

    public WorkDevice(double batteryCapacity, double memoryRom, double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.memoryRom = memoryRom;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInchs) {
        this.displayInches = displayInchs;
    }

    @Override
    public String toString() {
        return "WorkDevice{" +
                "batteryCapacity=" + batteryCapacity +
                ", memoryRom=" + memoryRom +
                ", displayInches=" + displayInches +
                '}';
    }
}
