/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Vehicle {
    private String brand;
    private int model;
    private String type;
    private int speed;

    public Vehicle() {
    } 

    public Vehicle(String brand, int model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
                
        switch (type) {
            case "A":
                speed = 3;
                break;
            case "M":
                speed = 2;
                break;
            case "B":
                speed = 1;
                break;
        }        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", model=" + model + ", type=" + type + ", speed=" + speed + '}';
    }
    
}
