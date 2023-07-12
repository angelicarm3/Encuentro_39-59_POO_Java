
import Entity.Roots;
import Service.RootsService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Extra3 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        RootsService rs1 = new RootsService();
        Roots r1 = rs1.createRoots();
        
        rs1.calculate(r1);
    }
    
}
