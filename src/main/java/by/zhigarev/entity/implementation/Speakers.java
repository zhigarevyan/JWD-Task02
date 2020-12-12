package by.zhigarev.entity.implementation;

import by.zhigarev.entity.HomeDevice;

import java.util.Scanner;

public class Speakers extends HomeDevice {
    private double numberOfSpeakers;
    private double frequencyMin;
    private double frequencyMax;
    private double cordLength;

    public Speakers(double powerConsumption, double numberOfSpeakers, double frequencyMin, double frequencyMax, double cordLength) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyMin = frequencyMin;
        this.frequencyMax = frequencyMax;
        this.cordLength = cordLength;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyMin() {
        return frequencyMin;
    }

    public void setFrequencyMin(double frequencyMin) {
        this.frequencyMin = frequencyMin;
    }

    public double getFrequencyMax() {
        return frequencyMax;
    }

    public void setFrequencyMax(double frequencyMax) {
        this.frequencyMax = frequencyMax;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }
}
