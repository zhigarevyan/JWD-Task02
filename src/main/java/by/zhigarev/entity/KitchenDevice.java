package by.zhigarev.entity;


public abstract class KitchenDevice extends HomeDevice{
    private double weight;
    private double width;
    private double height;

    public KitchenDevice(double powerConsumption, double weight, double width, double height) {
        super(powerConsumption);
        this.weight = weight;
        this.width = width;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "KitchenDevice{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", power_consumption=" + powerConsumption +
                '}';
    }
}
