/*
 * 
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author Angelica
 */
public class Rent {
    private String movie;
    private LocalDate startDate;
    private LocalDate endDate;
    private double price;

    public Rent() {
    }

    public Rent(String movie, LocalDate startDate, LocalDate endDate, double price) {
        this.movie = movie;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MovieRent{" + "movie=" + movie + ", startDate=" + startDate + ", endDate=" + endDate + ", price=" + price + '}';
    }
    
    
}
