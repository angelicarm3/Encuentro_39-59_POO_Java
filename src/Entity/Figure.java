/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Figure {
    private String name;
    private int type;
    private double area;
    private double perimeter;

    public Figure(int type) {
        this.type = type;
    }       

    public Figure(String name, int type, double area, double perimeter) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Figure{" + "name=" + name + ", type=" + type + ", area=" + area + ", perimeter=" + perimeter + '}';
    }

    
}
