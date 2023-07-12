/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Guessing {
    private String[] months;
    private String secretMonth;

    public Guessing() {
    }

    public Guessing(String[] months, String secretMonth) {
        this.months = months;
        this.secretMonth = secretMonth;
    }

    public String[] getMonths() {
        return months;
    }

    public void setMonths(String[] months) {
        this.months = months;
    }

    public String getSecretMonth() {
        return secretMonth;
    }

    public void setSecretMonth(String secretMonth) {
        this.secretMonth = secretMonth;
    }

    @Override
    public String toString() {
        return "Guessing{" + "months=" + months + ", secretMonth=" + secretMonth + '}';
    }

    
}
