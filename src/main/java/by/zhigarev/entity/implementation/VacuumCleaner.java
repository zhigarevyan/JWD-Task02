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

    public VacuumCleaner(double powerConsumption, FilterType filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
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
