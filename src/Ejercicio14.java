
import Entity.Mobile;
import Service.MobileService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Ejercicio14 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        MobileService ms1 = new MobileService();
        Mobile m1 = ms1.createMobile();
        
        ms1.showMobile(m1);
    }
    
}
