/*
 * 
 */
package Service;

import Entity.Nif;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class NifService {

    private Scanner leer = new Scanner(System.in);

    public Nif createNif() {
        System.out.println("Ingrese el DNI (8 dígitos).");
        long dni = leer.nextLong();
        
        String letter = calculateLetter(dni);
        
        return new Nif(dni, letter);
    }
    
    private String calculateLetter(long dni) {        
        String[] letters = new String[23];
        letters[0] = "T";
        letters[1] = "R";
        letters[2] = "W";
        letters[3] = "A";
        letters[4] = "G";
        letters[5] = "M";
        letters[6] = "Y";
        letters[7] = "F";
        letters[8] = "P";
        letters[9] = "D";
        letters[10] = "X";
        letters[11] = "B";
        letters[12] = "N";
        letters[13] = "J";
        letters[14] = "Z";
        letters[15] = "S";
        letters[16] = "Q";
        letters[17] = "V";
        letters[18] = "H";
        letters[19] = "L";
        letters[20] = "C";
        letters[21] = "K";
        letters[22] = "E";        
        
        int position = (int) dni % 23;
        
        return letters[position];
    }

    public void showNif(Nif n) {
        System.out.println(n.getDni() + "-" + n.getLetter());
    }
}
