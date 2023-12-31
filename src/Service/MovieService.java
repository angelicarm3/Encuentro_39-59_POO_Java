/*
 * 
 */
package Service;

import Entity.Movie;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class MovieService {
    
    private Scanner leer = new Scanner(System.in);   
    
    public Movie createMovie(String title, String genre, int year, int duration, ArrayList<Movie> movieList) {
        Movie m = new Movie(title, genre, year, duration);
        movieList.add(m);
        
        return m;
    }
    
    public ArrayList<Movie> createMovie(ArrayList<Movie> movieList) {
        /*
        * Recieves data and creates a Movie object.
        * return: Movie object. 
        */           
        Movie m = new Movie();
        
        System.out.println("Ingrese el nombre de la película.");
        m.setTitle(leer.nextLine()); 
        
        System.out.println("Ingrese el género de la película.");
        m.setGenre(leer.nextLine()); 
        
        System.out.println("Ingrese el año de lanzamiento de la película.");
        m.setYear(leer.nextInt()); 
        
        System.out.println("Ingrese la duración de la película (minutos).");
        m.setDuration(leer.nextInt()); 
        leer.nextLine();
                
        movieList.add(m);
        
        return movieList;
    }
    
    public void listMovies(ArrayList<Movie> movieList) {
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i));
        }
    }     
    
}
