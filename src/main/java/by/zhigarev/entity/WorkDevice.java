package by.zhigarev.entity;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WorkDevice implements ElectroDevice {
    private double batteryCapacity;
    private int memoryRom;
    private int displayInches;

    public WorkDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter batteryCapacity:");
        batteryCapacity = scanner.nextDouble();
        System.out.print("enter memoryRom:");
        memoryRom = scanner.nextInt();
        System.out.print("enter displayInches:");
        displayInches = scanner.nextInt();
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInchs) {
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
