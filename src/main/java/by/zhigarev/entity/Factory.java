package by.zhigarev.entity;

import by.zhigarev.entity.enums.TypesOfDevice;
import by.zhigarev.entity.impl.*;

import java.util.HashMap;

public class Factory {


    public ElectroDevice getElectroDevice(TypesOfDevice type, HashMap<String, Object> params) {
        ElectroDevice returnValue = null;
        switch (type) {
            case Laptop:
                returnValue = new Laptop(
                        Double.parseDouble((String) params.get("BATTERY_CAPACITY")),
                        Double.parseDouble((String) params.get("MEMORY_ROM")),
                        Double.parseDouble((String) params.get("DISPLAY_INCHES")),
                        (String) params.get("OS"),
                        Double.parseDouble((String) params.get("SYSTEM_MEMORY")),
                        Double.parseDouble((String) params.get("CPU")));
                break;
            case TabletPC:
                returnValue = new TabletPC(
                        Double.parseDouble((String) params.get("BATTERY_CAPACITY")),
                        Double.parseDouble((String) params.get("MEMORY_ROM")),
                        Double.parseDouble((String) params.get("DISPLAY_INCHES")),
                        Double.parseDouble((String) params.get("FLASH_MEMORY_CAPACITY")),
                        (String) params.get("COLOR"));
                break;
            case Oven:
                returnValue = new Oven(
                        Double.parseDouble((String) params.get("POWER_CONSUMPTION")),
                        Double.parseDouble((String) params.get("WEIGHT")),
                        Double.parseDouble((String) params.get("WIDTH")),
                        Double.parseDouble((String) params.get("HEIGHT")),
                        Double.parseDouble((String) params.get("CAPACITY")),
                        Double.parseDouble((String) params.get("DEPTH")));
                break;
            case Refrigerator:
                returnValue = new Refrigerator(
                        Double.parseDouble((String) params.get("POWER_CONSUMPTION")),
                        Double.parseDouble((String) params.get("WEIGHT")),
                        Double.parseDouble((String) params.get("WIDTH")),
                        Double.parseDouble((String) params.get("HEIGHT")),
                        Double.parseDouble((String) params.get("FREEZER_CAPACITY")),
                        Double.parseDouble((String) params.get("OVERALL_CAPACITY")));
                break;
            case VacuumCleaner:
                returnValue = new VacuumCleaner(
                        Double.parseDouble((String)  params.get("POWER_CONSUMPTION")),
                        (String) params.get("FILTER_TYPE"),
                        (String) params.get("BAG_TYPE"),
                        (String) params.get("WAND_TYPE"),
                        Double.parseDouble((String) params.get("MOTOR_SPEED_REGULATION")),
                        Double.parseDouble((String)  params.get("CLEANING_WIDTH")));
                break;
            case Speakers:
                returnValue = new Speakers(
                        Double.parseDouble((String)  params.get("POWER_CONSUMPTION")),
                        Double.parseDouble((String)  params.get("NUMBER_OF_SPEAKERS")),
                        (String) params.get("FREQUENCY_RANGE"),
                        Double.parseDouble((String)  params.get("CORD_LENGTH")));
                break;
        }
        return returnValue;
    }


}


