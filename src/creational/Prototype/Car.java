package creational.Prototype;

public interface Car extends Cloneable{
    Car clone();
    void drive();
}
