
import Entity.Mathematics;
import Service.MathematicsService;

/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio09 {
        
    public static void main(String[] args) {
        MathematicsService ms1 = new MathematicsService();
        
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
                
        Mathematics m1 = ms1.createMathematics(num1, num2);        
        
        int numMax = ms1.returnMax(m1);
        System.out.println("Max num = " + ms1.returnMax(m1));
        
        ms1.calculatePower(m1, numMax);
        System.out.println("Power = " + ms1.calculatePower(m1, numMax));
        
        ms1.calculateSquareRoot(m1, numMax);
        System.out.println("Square root = " + ms1.calculateSquareRoot(m1, numMax));
        
//        System.out.println(m1);        
    }
    
}
