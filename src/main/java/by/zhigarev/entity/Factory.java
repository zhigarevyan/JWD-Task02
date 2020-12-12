package by.zhigarev.entity;

import by.zhigarev.entity.enums.FilterType;
import by.zhigarev.entity.enums.Os;
import by.zhigarev.entity.enums.TypesOfDevice;
import by.zhigarev.entity.implementation.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Factory {


    public ElectroDevice getElectroDevice(TypesOfDevice type, HashMap<String,Object> params){
        ElectroDevice returnValue = null;
        switch (type){
            case Laptop:
                returnValue = new Laptop(
                        (double)params.get("BatteryCapacity"),
                        (double)params.get("MemoryRom"),
                        (double)params.get("DisplayInches"),
                        (Os)params.get("Os"),
                        (double)params.get("SystemMemory"),
                        (double)params.get("Cpu"));
                break;
            case PC:
                returnValue = new TabletPC(
                        (double)params.get("BatteryCapacity"),
                        (double)params.get("MemoryRom"),
                        (double)params.get("DisplayInches"),
                        (double)params.get("FlashMemoryCapacity"),
                        (Color) params.get("Color"));
                break;
            case Oven:
                returnValue = new Oven(
                        (double)params.get("PowerConsumption"),
                        (double)params.get("Weight"),
                        (double)params.get("Width"),
                        (double)params.get("Height"),
                        (double)params.get("Capacity"),
                        (double)params.get("Depth")
                );
                break;
            case Refrigerator:
                returnValue = new Refrigerator(
                        (double)params.get("PowerConsumption"),
                        (double)params.get("Weight"),
                        (double)params.get("Width"),
                        (double)params.get("Height"),
                        (double)params.get("FreezerCapacity"),
                        (double)params.get("OverallCapacity"));
                break;
            case VacuumCleaner:
                returnValue = new VacuumCleaner(
                        (double)params.get("PowerConsumption"),
                        (FilterType) params.get("FilterType"),
                        (String) params.get("BagType"),
                        (String) params.get("WandType"),
                        (double)params.get("MotorSpeedRegulation"),
                        (double)params.get("CleaningWidth"));
                break;
            case Speakers:
                returnValue = new Speakers(
                        (double)params.get("PowerConsumption"),
                        (double) params.get("NumberOfSpeakers"),
                        (double) params.get("FrequencyMin"),
                        (double) params.get("FrequencyMax"),
                        (double)params.get("CordLength"));
                break;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        Factory factory= new Factory();
        HashMap<String,Object> params = new HashMap<>();
        params.put("BatteryCapacity",200.0);
        params.put("Os",Os.Linux);
        params.put("MemoryRom",200.0);
        params.put("SystemMemory",200.0);
        params.put("Cpu",200.0);
        params.put("DisplayInches",200.0);

        ElectroDevice device = factory.getElectroDevice(TypesOfDevice.Laptop,params);
        System.out.println(device);







    }

}


