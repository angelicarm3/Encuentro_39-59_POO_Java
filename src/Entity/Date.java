/*
 * 
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author Angelica
 */
public class Date {
    
    private LocalDate date;
    
    public Date() {
    }       

    public Date(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date{" + "date=" + date + '}';
    }

    
}
