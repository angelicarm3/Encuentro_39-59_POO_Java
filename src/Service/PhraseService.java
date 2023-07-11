/*
 * 
 */
package Service;

import Entity.Phrase;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class PhraseService {

    private Scanner leer = new Scanner(System.in);
     
    public Phrase createPhrase() {
        /*
        * Recieves data from console and creates a Phrase object.
        * return: Phrase object. 
        */      
        System.out.println("Ingrese una frase.");
        String phrase = leer.nextLine();
                       
        return new Phrase(phrase, phrase.length());
    }
    
    public void showVowels(Phrase p) {
        /*
        * Recieves an objet Phrase and shows how many vowels the phrase has.
        */
        int vowels = 0;
        String[] letters = new String[p.getPhraselength()];
        
        for (int i = 0; i < p.getPhraselength(); i++) {
            letters[i] = (p.getPhrase().substring(i, i + 1));
            
            if (letters[i].equals("a") || letters[i].equals("e") || letters[i].equals("i") || letters[i].equals("o") || letters[i].equals("u")) {
                vowels++;
            }
        }
        
        System.out.println("La frase contiene " + vowels + " vocales.");
    }
    
    public void invertPhrase(Phrase p) {
        /*
        * Recieves an objet Phrase and reverts the phrase.
        */
        int j = p.getPhraselength();
        String[] letters = new String[p.getPhraselength()];
        
        for (int i = 0; i < p.getPhraselength(); i++) {
            letters[i] = (p.getPhrase().substring(j - 1, j));
            j--;
        }
        
        showVector(letters, p.getPhraselength());
    }    
    
    public void showVector(String[] vector, int vectorLength) {
        /*
        * Receives a vector and its length and prints it.
        */
        System.out.print("Frase invertida: ");
        
        for (int i = 0; i < vectorLength; i++) {
            System.out.print(vector[i]);
        }
        
        System.out.println("");
    }
    
    public void timesRepeated(Phrase p) {
        /*
        * Receives a Phrase object, asks for a character and counts how many times it's present in the phrase.
        */
        int repeated = 0;
        String[] letters = new String[p.getPhraselength()];
        
        System.out.println("Ingrese una letra.");
        String letter = leer.nextLine().toLowerCase();
        
        for (int i = 0; i < p.getPhraselength(); i++) {
            letters[i] = (p.getPhrase().substring(i, i + 1));
            
            if (letters[i].contains(letter)) {
                repeated++;
            }
        }
        
        System.out.println("El caracter " + letter + " se repite " + repeated + " veces.");
    }
    
    public void compareLength(Phrase p) {
        /*
        * Receives a Phrase object, asks for a phrase and compares their lengths.
        */
        System.out.println("Ingrese una frase.");
        String phrase2 = leer.nextLine();
                
        if (p.getPhraselength() == phrase2.length()) {
            System.out.println("Las dos frases tienen la misma longitud.");
        } else {
            System.out.println("Las dos frases no tienen la misma longitud.");
        }
    }
    
    public void joinPhrases(Phrase p) {
        /*
        * Receives a Phrase object, asks for a phrase and concatenates them.
        */
        System.out.println("Ingrese una frase.");
        String phrase2 = leer.nextLine();
        
        System.out.println(p.getPhrase().concat(phrase2));
    }
    
    public void replace(Phrase p) {
        /*
        * Receives a Phrase object, asks for a character and replaces all the "as" on the phrase for that character.
        */
        System.out.println("Ingrese un caracter.");
        String char1 = leer.nextLine();
        
        System.out.println(p.getPhrase().replace("a", char1));
    }
    
    public boolean contains(Phrase p) {
        /*
        * Receives a Phrase object, asks for a character and checks if the phrase contains the character.
        * return: tur if its present, false if not.
        */
        System.out.println("Ingrese un caracter.");
        String char1 = leer.nextLine();
        
        return p.getPhrase().contains(char1);
    }
    
//    public String[] toVector(Phrase p) {
//        /*
//        * Receives a Person Object and turns the phrase into a vector.
//         */
//        String[] letters = new String[p.getPhraselength()];
//
//        for (int i = 0; i < p.getPhraselength(); i++) {
//            letters[i] = (p.getPhrase().substring(i, i + 1));
//        }
//
//        return letters;
//    }
    
}
