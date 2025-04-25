package ObjectCreation;

import java.io.Serializable;

public class Car implements Cloneable, Serializable {

    private String name;
    private long price;
    private String model;

    public Car() {
        this.name = "Default Car";
        this.price = 0;
        this.model = "Default Model";
    }

    public Car(String name, long price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can't happen
        }
    }
}
