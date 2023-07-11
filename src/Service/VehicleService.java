/*
 * 
 */
package Service;

import Entity.Vehicle;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class VehicleService {

    private Scanner leer = new Scanner(System.in);

    public Vehicle createVehicle(String brand, int model, String type) {
        /*
        * Receives info from parameters and creates a Vehicle object.
        * return: Vehicle object. 
         */
        return new Vehicle(brand, model, type);
    }

    public Vehicle createVehicle() {
        /*
        * Recieves data from console and creates a Vehicle object.
        * return: Vehicle object. 
         */
        boolean valid = false;
        String type = "";

        System.out.println("Ingrese la marca del vehículo.");
        String brand = (leer.nextLine());

        System.out.println("Ingrese el modelo del vehículo.");
        int model = (leer.nextInt());
        leer.nextLine();

        do {
            System.out.println("Ingrese el tipo de vehículo.");
            System.out.println("A - Automóvil.");
            System.out.println("M - Motocicleta.");
            System.out.println("B - Bicicleta.");
            type = leer.nextLine().toUpperCase();

            valid = validateType(type);
        } while (!valid);

        return new Vehicle(brand, model, type);
    }

    private boolean validateType(String type) {
        /*
        * Validates type.
         */
        if (type.equals("A") || type.equals("M") || type.equals("B")) {
            return true;
        } else {
            System.out.println("Ingrese una opción válida.");
            return false;
        }
    }

    public int move(Vehicle v, int time) {
        /*
        * Calculates distance traveled in time.
        */           
        int distance = v.getSpeed() * time;

        distance = stop(v, distance);

        System.out.println(v.getType() + " - Distancia recorrida en " + time + " segundos = " + distance + "mt.");
        
        return distance;
    }

    public void move(Vehicle... vehicles) {
        /*
        * Calculates distance traveled in time.
         */
        boolean another = false;

        do {
            System.out.println("Ingrese los segundos de recorrido.");
            int time = leer.nextInt();
            leer.nextLine();
            int distance[] = new int[vehicles.length];

            for (int i = 0; i < vehicles.length; i++) {
                distance[i] = vehicles[i].getSpeed() * time;
                distance[i] = stop(vehicles[i], distance[i]);

                System.out.println(vehicles[i].getType() + " - Distancia recorrida en " + time + " segundos = " + distance[i] + "mt.");
            }
            
            another = anotherCalculation();
        } while (!another);
    }

    private int stop(Vehicle v, int distance) {
        /*
        * Calculates final distance after stopping.
         */
        switch (v.getType()) {
            case "A":
                distance += 2;
                return distance;
            case "M":
                distance += 2;
                return distance;
            case "B":
                distance += 0;
                return distance;
            default:
                return distance;
        }
    }

    private boolean anotherCalculation() {
        boolean valid = false;
        String answer = "";
        
        do {
        System.out.println("¿Desea realizar otro cálculo? (S/N)");
        answer = leer.nextLine().toUpperCase();
        
        valid = validateAnswer(answer);
        } while (!valid);
        
        if (answer.equals("S")) {
            return false;
        } else {
            return true;                    
        }
    }
    
    private boolean validateAnswer(String answer) {
        if (answer.equals("S") || answer.equals("N")) {
            return true;
        } else {
            System.out.println("Ingrese una opcion válida.");
            return false;
        }
    }
}
