import Entity.Vehicle;
import Service.VehicleService;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * 
 */


/**
 *
 * @author Angelica
 */
public class Dia5_Ejercicio1 {
    private Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        VehicleService vs1 = new VehicleService();
        Vehicle v1 = vs1.createVehicle("Susuki", 2022, "M");        
        Vehicle v2 = vs1.createVehicle("Honda", 1991, "A");
        Vehicle v3 = vs1.createVehicle("Biker", 2020, "B");
                
        maxDistance(5, v1, v2, v3);
        maxDistance(10, v1, v2, v3);
        maxDistance(60, v1, v2, v3);
        maxDistance(300, v1, v2, v3);
    }    
    
    public static void maxDistance(int time, Vehicle... vehicles) {        
        VehicleService vs1 = new VehicleService();
        int max = 0;
        Vehicle fastest = vehicles[0];
        
        for (int i = 0; i < vehicles.length; i++) {
            int distance = vs1.move(vehicles[i], time);
            
            if (distance > max) {
                max = distance;
                fastest = vehicles[i];
            }
        }        
        
        System.out.println("El vehículo que llego más lejos fue " + fastest.getType());
        System.out.println("Recorrió " + max + "mt en " + time + " segundos.");
        System.out.println("");
    }
   
}
