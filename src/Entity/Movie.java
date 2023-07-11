/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class Movie {
    private String title;
    private String genre;
    private int year;
    private int duration;

    public Movie() {
    }

    public Movie(String title, String genre, int year, int duration) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String Genre) {
        this.genre = Genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", genre=" + genre + ", year=" + year + ", duration=" + duration + '}';
    }   
    
}
