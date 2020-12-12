package by.zhigarev.entity.implementation;

import by.zhigarev.entity.enums.FilterType;
import by.zhigarev.entity.HomeDevice;

public class VacuumCleaner extends HomeDevice {
    private FilterType filter_type;
    private String bag_type;
    private String wand_type = "build-in";
    private double motor_speed_regulation;
    private double cleaning_width;

    public VacuumCleaner(double powerConsumption, FilterType filter_type, String bag_type, String wand_type, double motor_speed_regulation, double cleaning_width) {
        super(powerConsumption);
        this.filter_type = filter_type;
        this.bag_type = bag_type;
        this.wand_type = wand_type;
        this.motor_speed_regulation = motor_speed_regulation;
        this.cleaning_width = cleaning_width;
    }

    public FilterType getFilter_type() {
        return filter_type;
    }

    public void setFilter_type(FilterType filter_type) {
        this.filter_type = filter_type;
    }

    public String getBag_type() {
        return bag_type;
    }

    public void setBag_type(String bag_type) {
        this.bag_type = bag_type;
    }

    public String getWand_type() {
        return wand_type;
    }

    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }

    public double getMotor_speed_regulation() {
        return motor_speed_regulation;
    }

    public void setMotor_speed_regulation(double motor_speed_regulation) {
        this.motor_speed_regulation = motor_speed_regulation;
    }

    public double getCleaning_width() {
        return cleaning_width;
    }

    public void setCleaning_width(double cleaning_width) {
        this.cleaning_width = cleaning_width;
    }
}
