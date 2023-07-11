/*
 * 
 */
package Service;

import Entity.CoffeeMaker;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class CoffeeMakerService {

    private Scanner leer = new Scanner(System.in);

    public CoffeeMaker createCoffeeMaker() {
        return new CoffeeMaker();
    }
    
    public void menu (CoffeeMaker cm) {
        boolean exit = false;
        boolean valid = false;
        int optionMenu = 0;

        do {
            do {
                System.out.println("--- NESPRESSO ---");
                System.out.println("-----------------");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Servir una taza de café.");
                System.out.println("2. Revisar cantidad de café.");
                System.out.println("3. Agregar café.");
                System.out.println("4. Llenar cafetera.");
                System.out.println("5. Vaciar cafetera.");
                System.out.println("6. Apagar.");
                optionMenu = leer.nextInt();
                leer.nextLine();
                valid = validateMenu(optionMenu);
            } while (!valid);
            
            exit = executeMenu(cm, optionMenu);
        } while (!exit);
    }
    
    private boolean validateMenu (int option) {
        if (option > 0 || option < 7) {
            return true;
        } else {
            System.out.println("Ingrese una opcion válida.");
            return false;
        }
    }
    
    private boolean executeMenu (CoffeeMaker cm, int option) {
        switch (option) {
            case 1:
                serveCup(cm);
                System.out.println("");                
                return false;
            case 2:
                showInfo(cm);    
                System.out.println("");            
                return false;
            case 3:
                addCoffee (cm);     
                System.out.println("");           
                return false;
            case 4:
                fillCoffeeMaker(cm);    
                System.out.println("");            
                return false;
            case 5:
                emptyCoffeeMaker(cm);    
                System.out.println("");            
                return false;
            case 6:
                return true;
            default:                                
                return false;
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

    public void serveCup(CoffeeMaker cm) {
        boolean valid = false;
        boolean another = false;
        String option = "";
       
        do {
            do {
                System.out.println("Seleccione el tamaño del café");
                System.out.println("A. 3oz.");
                System.out.println("B. 5oz.");
                System.out.println("C. 8oz.");
                option = leer.nextLine().toUpperCase();

                valid = validateOption(option);
            } while (!valid);

            validateQuantity(cm, option);
            another = serveAnother();
        } while (!another);
    }

    private boolean validateOption (String option) {
        if (option.equals("A") || option.equals("B") || option.equals("C")) {
            return true;
        } else {
            System.out.println("Seleccione una opcion válida.");
            return false;
        }
    }
    
    private void validateQuantity (CoffeeMaker cm, String option) {
        int cupSize = 0;
        
        switch (option) {
            case "A":
                cupSize = 3;
                break;
            case "B":
                cupSize = 5;
                break;
            case "C":
                cupSize = 8;
                break;            
        }
        
        if (cm.getCurrentQuantity() == 0) {
            System.out.println("La cafetera está vacia, por favor llénela.");
        } else if (cupSize > cm.getCurrentQuantity()) {
            int servedQuantity = cm.getCurrentQuantity();
            cm.setCurrentQuantity(cm.getCurrentQuantity() - servedQuantity);
            
            System.out.println("SIRVIENDO CAFÉ");
            System.out.println("--------------");
            System.out.println("La taza no se pudo llenar.");
            System.out.println("Se han servido " + servedQuantity + "oz.");
        } else {
            int servedQuantity = cupSize;
            cm.setCurrentQuantity(cm.getCurrentQuantity() - servedQuantity);
                        
            System.out.println("SIRVIENDO CAFÉ");
            System.out.println("--------------");
            System.out.println("Se han servido " + servedQuantity + "oz.");
        }
    }
    
    private boolean serveAnother() {
        boolean valid = false;
        String answer = "";
              
        do {
            System.out.println("¿Desea servir otra taza? (S/N)");
            answer = leer.nextLine().toUpperCase();
            
            valid = validateAnswer(answer);
        } while (!valid);
        
        if (answer.equals("S")) {
            return false;
        } else {
            return true;
        }
    }

    public void showInfo(CoffeeMaker cm) {
        System.out.println("ESTADO ACTUAL");
        System.out.println("Capacidad total: " + cm.getMaxCapacity() + "oz.");
        System.out.println("Cantidad actual: " + cm.getCurrentQuantity() + "oz.");
    }
    
    public void addCoffee (CoffeeMaker cm) {
        boolean valid = false;
        int coffeeQuantity = 0;
        
        do {
            System.out.println("Ingrese la cantidad de café que va a agregar.");
            coffeeQuantity = leer.nextInt();
            
            valid = validateQuantity(cm, coffeeQuantity);            
        } while (!valid);        
        
        cm.setCurrentQuantity(cm.getCurrentQuantity() + coffeeQuantity);
    }
    
    private boolean validateQuantity(CoffeeMaker cm, int Quantity) {
        if (Quantity + cm.getCurrentQuantity() > cm.getMaxCapacity()) {
            System.out.println("La cantidad ingresada supera la capacidad total.");
            System.out.println("Puede ingresar máximo " + (cm.getMaxCapacity() - cm.getCurrentQuantity()) + "oz.");
            return false;
        } else {
            return true;
        }
    }

    public void fillCoffeeMaker(CoffeeMaker cm) {
        cm.setCurrentQuantity(cm.getMaxCapacity());
    }
    
    public void emptyCoffeeMaker (CoffeeMaker cm) {
        cm.setCurrentQuantity(0);
    }

}
