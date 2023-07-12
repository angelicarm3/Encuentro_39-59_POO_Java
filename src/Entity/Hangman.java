/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Hangman {
    private String[] word;
    private int foundLetters;
    private int attempts;

    public Hangman() {
    }

    public Hangman(String[] word, int foundLetters, int attempts) {
        this.word = word;
        this.foundLetters = foundLetters;
        this.attempts = attempts;
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public int getFoundLetters() {
        return foundLetters;
    }

    public void setFoundLetters(int foundLetters) {
        this.foundLetters = foundLetters;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "Hangman{" + "word=" + word + ", foundLetters=" + foundLetters + ", attempts=" + attempts + '}';
    }
}
