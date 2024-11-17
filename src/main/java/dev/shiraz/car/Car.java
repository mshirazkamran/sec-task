package dev.shiraz.car;

public class Car {
    
    private String name;
    private String model;
    private int year;
    private boolean isConvertible;

    public Car() {

    }

    public Car (String name, String model, int year, boolean isConvertible) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.isConvertible = isConvertible;
    }

    @Override
    public String toString() {
        return "Car { name=" + name 
        + ", model=" + model 
        + ", year=" + year 
        + ", isConvertible=" 
        + isConvertible 
        + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }
}
