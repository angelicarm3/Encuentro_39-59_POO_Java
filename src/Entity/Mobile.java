/*
 * 
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author Angelica
 */
public class Mobile {
    private String brand;
    private double price;
    private String model;
    private int ram;
    private int storage;
    int[] code = new int[7];

    public Mobile() {
    }

    public Mobile(String brand, double price, String model, int ram, int storage, int[] code) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Mobile{" + "brand=" + brand + ", price=" + price + ", model=" + model + ", ram=" + ram + ", storage=" + storage + ", code=" + code + '}';
    }
}
