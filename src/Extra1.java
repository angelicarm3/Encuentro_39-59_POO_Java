
import Entity.Song;
import Service.SongService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Extra1 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        SongService ss1 = new SongService();
        Song s1 = ss1.createSong();
        Song s2 = ss1.createSong("Hello", "Adele");
        
        System.out.println(s1);
        System.out.println(s2);
    }
    
}
