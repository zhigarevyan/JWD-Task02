package by.zhigarev.entity.impl;

import by.zhigarev.entity.HomeDevice;

public class Speakers extends HomeDevice {
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers(double powerConsumption, double numberOfSpeakers, String frequencyRange, double cordLength) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }


    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "number_of_speakers=" + numberOfSpeakers +
                ", frequency_range='" + frequencyRange + '\'' +
                ", cord_length=" + cordLength +
                super.toString()+
                '}';
    }
}
