package by.zhigarev.entity;

import java.util.Scanner;

public class HomeDevice implements ElectroDevice {
    double powerConsumption;

    public HomeDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter powerConsumption");
        powerConsumption = scanner.nextDouble();
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
