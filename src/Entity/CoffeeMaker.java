/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class CoffeeMaker {
    
    private int maxCapacity;
    private int currentQuantity;

    public CoffeeMaker() {
        this.maxCapacity = 30;
    }      

    public CoffeeMaker(int currentQuantity) {
        this.maxCapacity = 30;
        this.currentQuantity = currentQuantity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }   
    
}
