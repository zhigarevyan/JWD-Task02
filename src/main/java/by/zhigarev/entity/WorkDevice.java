package by.zhigarev.entity;

public class WorkDevice implements Appliance {
    private double battery_capacity;
    private double memory_rom;
    private double display_inches;

    public WorkDevice(double battery_capacity, double memory_rom, double display_inches) {
        this.battery_capacity = battery_capacity;
        this.memory_rom = memory_rom;
        this.display_inches = display_inches;
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }

    public void setBattery_capacity(double battery_capacity) {
        this.battery_capacity = battery_capacity;
    }

    public double getMemory_rom() {
        return memory_rom;
    }

    public void setMemory_rom(double memory_rom) {
        this.memory_rom = memory_rom;
    }

    public double getDisplay_inches() {
        return display_inches;
    }

    public void setDisplay_inches(double displayInchs) {
        this.display_inches = displayInchs;
    }

    @Override
    public String toString() {
        return "WorkDevice{" +
                "batteryCapacity=" + battery_capacity +
                ", memoryRom=" + memory_rom +
                ", displayInches=" + display_inches +
                '}';
    }
}
