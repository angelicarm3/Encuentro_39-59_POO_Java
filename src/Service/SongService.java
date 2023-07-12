/*
 * 
 */
package Service;

import Entity.Song;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class SongService {

    private Scanner leer = new Scanner(System.in);
      
     public Song createSong() {
         return new Song("", "");
     }
     
     public Song createSong(String title, String author) {
         return new Song(title, author);
     }
}
