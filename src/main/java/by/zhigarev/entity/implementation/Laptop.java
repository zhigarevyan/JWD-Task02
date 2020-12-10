package by.zhigarev.entity.implementation;

import by.zhigarev.entity.enums.Os;
import by.zhigarev.entity.WorkDevice;
import by.zhigarev.entity.enums.TypesOfDevice;

import java.util.Scanner;

public class Laptop extends WorkDevice {
    private Os os;
    private double systemMemory;
    private double cpu;

    public Laptop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OS: \n0 - Linux\n1 - Windows\n3 - MacOS");
        switch (scanner.nextInt()){
            case 0:
                os = Os.Linux;
                break;
            case 1:
                os = Os.Windows;
                break;
            case 3:
                os = Os.MacOs;
                break;
        }
        System.out.println("Enter systemMemory");
        systemMemory = scanner.nextInt();
        System.out.println("Enter cpu");
        cpu = scanner.nextDouble();
    }

    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "os=" + os +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                '}';
    }
}
