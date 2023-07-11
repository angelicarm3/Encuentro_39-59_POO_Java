/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Phrase {
    private String phrase;
    private int phraselength;

    public Phrase() {
    }   
    
    public Phrase(String phrase, int phraselength) {
        this.phrase = phrase;
        this.phraselength = phraselength;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getPhraselength() {
        return phraselength;
    }

    public void setPhraselength(int phraselength) {
        this.phraselength = phraselength;
    } 

    @Override
    public String toString() {
        return "Phrase{" + "phrase=" + phrase + ", phraselength=" + phraselength + '}';
    }
    
}

