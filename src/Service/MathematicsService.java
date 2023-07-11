/*
 * 
 */
package Service;

import Entity.Mathematics;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class MathematicsService {    
    private DecimalFormat formato1 = new DecimalFormat("#.##");
    private Scanner leer = new Scanner(System.in);
     
    public Mathematics createMathematics(int num1, int num2) {
        /*
        * Recieves data and creates a Mathematics object.
        * return: Mathematics object. 
        */           
        Mathematics m1 = new Mathematics();
        
        m1.setNum1(num1);
        m1.setNum2(num2);
                               
        return m1;
    }
    
   public int returnMax (Mathematics m1) {
       /*
       * Recieves a Mathematics object, and calculates the max number.
       * return: Max number.
       */       
       if (m1.getNum1() > m1.getNum2()) {
           return m1.getNum1();
       } else {
           return m1.getNum2();
       }
   }
   
   public int calculatePower (Mathematics m1, int numMax) {
       /*
       * Recieves a Mathematics object, and calculates maxNum^minNum.
       * return: power.
       */ 
       if (numMax == m1.getNum1()) {
           return (int) Math.pow(m1.getNum1(), m1.getNum2());
       } else {
           return (int) Math.pow(m1.getNum2(), m1.getNum1());
       }
   }
   
   public String calculateSquareRoot (Mathematics m1, int numMax) {
       /*
       * Recieves a Mathematics object, and calculates the square root of minNum.
       * return: sqRoot.
       */ 
       if (numMax == m1.getNum1()) {
           return formato1.format(Math.sqrt(Math.abs((double) m1.getNum2())));
       } else {
           return formato1.format(Math.sqrt(Math.abs((double) m1.getNum1())));
       }
   }
    
}
