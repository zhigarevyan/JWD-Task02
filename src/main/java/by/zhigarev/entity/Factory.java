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
                        (double)params.get("battery_capacity"),
                        (double)params.get("memory_rom"),
                        (double)params.get("display_inches"),
                        (Os)params.get("os"),
                        (double)params.get("system_memory"),
                        (double)params.get("cpu"));
                break;
            case PC:
                returnValue = new TabletPC(
                        (double)params.get("battery_capacity"),
                        (double)params.get("memory_rom"),
                        (double)params.get("display_inches"),
                        (double)params.get("flash_memory_capacity"),
                        (Color) params.get("color"));
                break;
            case Oven:
                returnValue = new Oven(
                        (double)params.get("power_consumption"),
                        (double)params.get("weight"),
                        (double)params.get("width"),
                        (double)params.get("height"),
                        (double)params.get("capacity"),
                        (double)params.get("depth")
                );
                break;
            case Refrigerator:
                returnValue = new Refrigerator(
                        (double)params.get("power_consumption"),
                        (double)params.get("weight"),
                        (double)params.get("width"),
                        (double)params.get("height"),
                        (double)params.get("freezer_capacity"),
                        (double)params.get("overall_capacity"));
                break;
            case VacuumCleaner:
                returnValue = new VacuumCleaner(
                        (double)params.get("power_consumption"),
                        (FilterType) params.get("filter_type"),
                        (String) params.get("bag_type"),
                        (String) params.get("wand_type"),
                        (double)params.get("motor_speed_regulation"),
                        (double)params.get("cleaning_width"));
                break;
            case Speakers:
                returnValue = new Speakers(
                        (double)params.get("power_consumption"),
                        (double) params.get("number_of_speakers"),
                        (String) params.get("frequency_range"),
                        (double)params.get("cord_length"));
                break;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        Factory factory= new Factory();
        HashMap<String,Object> params = new HashMap<>();
        params.put("battery_capacity",200.0);
        params.put("os",Os.Linux);
        params.put("memory_rom",200.0);
        params.put("system_memory",200.0);
        params.put("cpu",200.0);
        params.put("display_inches",200.0);

        ElectroDevice device = factory.getElectroDevice(TypesOfDevice.Laptop,params);
        System.out.println(device);







    }

}


