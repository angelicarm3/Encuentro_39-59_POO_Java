
import Entity.Nif;
import Service.NifService;
import java.util.Scanner;


/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Extra4 {
    private Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        NifService ns1 = new NifService();
        Nif n1 = ns1.createNif();
        
        ns1.showNif(n1);
    }

}
