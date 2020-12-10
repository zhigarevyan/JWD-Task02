package by.zhigarev.entity.implementation;

import by.zhigarev.entity.enums.FilterType;
import by.zhigarev.entity.HomeDevice;


import java.util.Scanner;

public class VacuumCleaner extends HomeDevice {
    private FilterType filterType;
    private String bagType;
    private String wandType = "build-in";
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type: \n0 - A\n1 - B\n3 - C");
        switch (scanner.nextInt()) {
            case 0:
                filterType = FilterType.A;
                break;
            case 1:
                filterType = FilterType.B;
                break;
            case 3:
                filterType = FilterType.C;
                break;
        }
        System.out.println("Enter bagType(TEXT)");
        bagType = scanner.next();
        System.out.println("Enter motorSpeedRegulation");
        motorSpeedRegulation = scanner.nextDouble();
        System.out.println("Enter cleaningWidth");
        cleaningWidth = scanner.nextDouble();
    }

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
}
