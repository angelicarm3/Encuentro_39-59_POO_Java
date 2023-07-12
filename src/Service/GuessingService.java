/*
 * 
 */
package Service;

import Entity.Guessing;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class GuessingService {

    private Scanner leer = new Scanner(System.in);

    public Guessing createGuessing() {
        String[] months = new String[12];
        months[0] = "enero";
        months[1] = "febrero";
        months[2] = "marzo";
        months[3] = "abril";
        months[4] = "mayo";
        months[5] = "junio";
        months[6] = "julio";
        months[7] = "agosto";
        months[8] = "septiembre";
        months[9] = "octubre";
        months[10] = "noviembre";
        months[11] = "diciembre";

        return new Guessing(months, months[9]);
    }

    public void validateGuessing(Guessing g) {
        String guess = "";
        
        do {
            System.out.println("Ingrese el nombre del mes.");
            guess = leer.nextLine().toLowerCase();
            
            if (guess.equals(g.getSecretMonth())) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente de nuevo.");
                System.out.println("");
            }            
        } while (!guess.equals(g.getSecretMonth()));
    }
}
