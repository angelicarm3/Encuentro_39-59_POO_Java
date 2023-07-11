
import Entity.Phrase;
import Service.PhraseService;

/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio08 {
        
    public static void main(String[] args) {
        PhraseService ps1 = new PhraseService();
        Phrase p1 = ps1.createPhrase();        
        
        ps1.showVowels(p1);
        ps1.invertPhrase(p1);
        ps1.timesRepeated(p1);
        ps1.compareLength(p1);
        ps1.joinPhrases(p1);
        ps1.replace(p1);
        
        boolean doescontain = ps1.contains(p1);
        
        if (doescontain) {
            System.out.println("La frase si contiene el caracter.");
        } else {
            System.out.println("La frase no contiene el caracter.");
        }
        
    }
    
}
