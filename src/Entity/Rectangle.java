/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Rectangle {
    
    private int base;
    private int heigth;

    public Rectangle(int base, int heigth) {
        this.base = base;
        this.heigth = heigth;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    } 

    public int getBase() {
        return base;
    }

    public int getHeigth() {
        return heigth;
    }   
    
}
