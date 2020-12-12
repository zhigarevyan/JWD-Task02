package by.zhigarev.entity;

import java.util.Scanner;

public class HomeDevice implements ElectroDevice {
    double powerConsumption;

    public HomeDevice(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
