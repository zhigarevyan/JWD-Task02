package by.zhigarev.entity;

import by.zhigarev.entity.enums.Os;
import by.zhigarev.entity.enums.TypesOfDevice;
import by.zhigarev.entity.implementation.*;

import java.util.Scanner;

public class Factory {
    public ElectroDevice getElectroDevice(int type){
        Scanner scanner = new Scanner(System.in);
        ElectroDevice returnValue = null;




        switch (type){
            case 0:
                returnValue = new Laptop();
                break;
            case 1:
                returnValue = new TabletPC();
                break;
            case 2:
                returnValue = new Oven();
                break;
            case 3:
                returnValue = new Refrigerator();
                break;
            case 4:
                returnValue = new VacuumCleaner();
                break;
            case 5:
                returnValue = new Speakers();
                break;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        Factory factory= new Factory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Device: \n0 - Laptop\n1 - PC\n3 - Oven\n4 - RefrigeratorSpeakers\n5 - VacuumCLeaner\n6 - Speakers");

        System.out.println(factory.getElectroDevice(scanner.nextInt()));


    }

}


