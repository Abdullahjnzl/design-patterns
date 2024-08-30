package creational.Prototype;

import lombok.Setter;

@Setter
public class Sedan implements Car {
    private String model;
    private String color;

    public Sedan(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + color + " " + model + " Sedan.");
    }

    @Override
    public String toString() {
        return "Sedan [model=" + model + ", color=" + color + "]";
    }
}

