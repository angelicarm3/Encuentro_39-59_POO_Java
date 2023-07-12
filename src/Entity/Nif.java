/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Nif {
    private long dni;
    private String letter;

    public Nif() {
    }

    public Nif(long dni, String letter) {
        this.dni = dni;
        this.letter = letter;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Nif{" + "dni=" + dni + ", letter=" + letter + '}';
    }
}
