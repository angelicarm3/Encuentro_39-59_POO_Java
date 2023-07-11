/*
 * 
 */
package Service;

import Entity.Mobile;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class MobileService {

    private Scanner leer = new Scanner(System.in);

    public Mobile createMobile() {
        /*
        * Creates a Course object.
        * return: Person object. 
        */    
        boolean valid = false;
        Mobile m1 = new Mobile();
        
        System.out.println("Ingrese la marca del móvil.");
        m1.setBrand(leer.nextLine());
        
        System.out.println("Ingrese el precio del móvil.");
        m1.setPrice(leer.nextInt());
        leer.nextLine();
        
        System.out.println("Ingrese el modelo del móvil.");
        m1.setModel(leer.nextLine());
                             
        System.out.println("Ingrese la memoria RAM del móvil.");
        m1.setRam(leer.nextInt());
                
        System.out.println("Ingrese el almacenamiento del móvil.");
        m1.setStorage(leer.nextInt());
        
        m1.setCode(uploadCode());
        
        return m1;
    }
    
    private int[] uploadCode() {
        /*
        * Asks for the code numbers and stores it in an array
        * return: codeList
        */
        int[] codeList = new int[7];
        
        System.out.println("Ingrese el código un número a la vez.");
        
        for (int i = 0; i < codeList.length; i++) {
            codeList[i] = leer.nextInt();
        }
        
        return codeList;
    }
    
    public void showMobile(Mobile m) {
        /*
        * Receives a Mobile object and prints it.
        */
        System.out.println("------- MÓVIL -------");
        System.out.println("Marca: " + m.getBrand());
        System.out.println("Modelo: " + m.getModel());
        System.out.println("Precio: $" + m.getPrice());
        System.out.println("Memoria RAM: " + m.getRam() + "GB");
        System.out.println("Almacenamiento: " + m.getStorage() + "GB");
        System.out.print("Código: ");
        
        for (int i = 0; i < m.getCode().length; i++) {
            System.out.print(m.getCode()[i]);
        }
        
        System.out.println("");
    }
}
