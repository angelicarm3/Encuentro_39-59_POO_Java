/*
 * 
 */
package Service;

import Entity.Hangman;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class HangmanService {

    private Scanner leer = new Scanner(System.in);

    public Hangman createHangman() {
        System.out.println("Ingrese la palabra.");
        String completeWord = leer.nextLine();

        String[] word = new String[completeWord.length()];

        for (int i = 0; i < completeWord.length(); i++) {
            word[i] = completeWord.substring(i, i + 1);
        }

        System.out.println("Ingrese la cantidad de intentos permitidos.");
        int attempts = leer.nextInt();
        leer.nextLine();

        int foundLetters = 0;

        return new Hangman(word, foundLetters, attempts);
    }

    public void game(Hangman h) {
        String letter = "";
        
        do {
            if (h.getAttempts() > 0) {
                System.out.println("Ingrese una letra.");
                letter = leer.nextLine().toLowerCase();
                
                showLength(h);
                searchLetter(h, letter);
                showFound(h);              
                attempsLeft(h);
            }
        } while (h.getAttempts() > 0);
    }

    private void showLength(Hangman h) {
        System.out.println("Longitud palabra: " + h.getWord().length);
    }
    
    private void searchLetter(Hangman h, String letter) {        
        if (h.getAttempts() > 0) {  
            if (found(h, letter)) {
                System.out.println("La letra ingresada pertenece a la palabra.");
            } else {
                System.out.println("La letra ingresada no pertenece a la palabra.");
            }    
        }
    }

    private boolean found(Hangman h, String letter) {
        int flag = 0;
        boolean found = false;

        for (int i = 0; i < h.getWord().length; i++) {
            if (h.getWord()[i].equals(letter)) {
                h.setFoundLetters(h.getFoundLetters() + 1);;
                flag++;
            }
        }

        if (flag > 0) {
            return true;
        } else {
            h.setAttempts(h.getAttempts() - 1);
            return false;
        }
    }
    
    private void showFound(Hangman h) {
        if (h.getAttempts() > 0) {
            System.out.println("Letras encontradas: " + h.getFoundLetters());
            System.out.println("Letras restantes: " + (h.getWord().length - h.getFoundLetters()));
        }
    }

    private void attempsLeft(Hangman h) {
        if (h.getAttempts() > 0) {
            System.out.println("Oportunidades restantes: " + h.getAttempts());
            System.out.println("----------------------------------------------");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("----------- x_x -----------");
            System.out.println("Se ha quedado sin intentos.");
            System.out.println("");
        }
    }
}
