
import java.util.Arrays;

/*
 * 
 */

/**
 *
 * @author Angelica
 */
public class Ejercicio10 {
        
    public static void main(String[] args) {
        int[] vector1 = asignVector();
                
        System.out.print("Vector 1: ");
        showVector(vector1);
        
        Arrays.sort(vector1);
        System.out.print("Vector 1 ordenado: ");
        showVector(vector1);

        double[] vector2 = asignVector2(vector1);
        System.out.print("Vector 2: ");
        showVector(vector2);
    }
    
    public static int[] asignVector() {
        /*
        * Asigns an int vector (size 50) with random numbers (0-100).
        * returns: int[] vector.
        */
        int[] vector = new int[50];
        
        for (int i = 0; i < 50; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        
        return vector;
    }
    
    public static double[] asignVector2(int[] vector1) {
        /*
        * Recieves an int[] vector1 (size 50) asigns a double vector2 (size 20) as follows: 
        * copies the first 10 number from vector1 onto vector2 and asigns 0,5 in the last 10 positions.
        * return: double[] vector2.
        */
        double[] vector2 = new double[20];
        
        for (int i = 0; i < 10; i++) {
            vector2[i] = vector1[i];
        }
        
        Arrays.fill(vector2, 10, 20, 0.5);
        
        return vector2;
    }
    
    public static void showVector(int[] vector) {
        /*
        * Prints an int[] vector.
        */
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                System.out.print(vector[i]);
            } else {
                System.out.print(vector[i] + ", ");
            }            
        }
        
        System.out.println("");
        System.out.println("");
    }
    
    public static void showVector(double[] vector) {
        /*
        * Prints a double[] vector.
        */
        for (int i = 0; i < vector.length; i++) {
            if (i == vector.length - 1) {
                System.out.print(vector[i]);
            } else {
                System.out.print(vector[i] + ", ");
            }            
        }
        
        System.out.println("");
        System.out.println("");
    }
}
