
import Entity.Hangman;
import Service.HangmanService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Extra6 {
    private Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        HangmanService hs1 = new HangmanService();
        Hangman h1 = hs1.createHangman();
        
        hs1.game(h1);
        
    }

}
