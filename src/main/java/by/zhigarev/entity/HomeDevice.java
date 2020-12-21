package by.zhigarev.entity;

public abstract class HomeDevice implements Appliance {
    double powerConsumption;

    public HomeDevice(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "HomeDevice{" +
                "power_consumption=" + powerConsumption +
                '}';
    }
}
