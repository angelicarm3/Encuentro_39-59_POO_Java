
import Entity.Guessing;
import Service.GuessingService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Extra5 {
    private Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        GuessingService gs1 = new GuessingService();
        Guessing g1 = gs1.createGuessing();
        
        gs1.validateGuessing(g1);
    }

}
