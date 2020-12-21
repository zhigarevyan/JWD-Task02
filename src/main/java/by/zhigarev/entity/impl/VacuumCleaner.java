package by.zhigarev.entity.impl;

import by.zhigarev.entity.HomeDevice;

public class VacuumCleaner extends HomeDevice {
    private String filterType;
    private String bagType;
    private String wandType = "build-in";
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(double powerConsumption, String filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
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

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "filter_type='" + filterType + '\'' +
                ", bag_type='" + bagType + '\'' +
                ", wand_type='" + wandType + '\'' +
                ", motor_speed_regulation=" + motorSpeedRegulation +
                ", cleaning_width=" + cleaningWidth +
                super.toString()+
                '}';
    }
}
