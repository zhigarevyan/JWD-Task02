package by.zhigarev.entity.implementation;

import by.zhigarev.entity.HomeDevice;

public class Speakers extends HomeDevice {
    private double number_of_speakers;
    private String frequency_range;
    private double cord_length;

    public Speakers(double powerConsumption, double number_of_speakers, String frequency_range, double cord_length) {
        super(powerConsumption);
        this.number_of_speakers = number_of_speakers;
        this.frequency_range = frequency_range;
        this.cord_length = cord_length;
    }

    public double getNumber_of_speakers() {
        return number_of_speakers;
    }

    public void setNumber_of_speakers(double number_of_speakers) {
        this.number_of_speakers = number_of_speakers;
    }

    public String getFrequency_range() {
        return frequency_range;
    }

    public void setFrequency_range(String frequency_range) {
        this.frequency_range = frequency_range;
    }


    public double getCord_length() {
        return cord_length;
    }

    public void setCord_length(double cord_length) {
        this.cord_length = cord_length;
    }
}
