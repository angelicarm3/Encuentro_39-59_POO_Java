/*
 * 
 */
package Service;

import Entity.Figure;
import static java.lang.Math.PI;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class FigureService {

    private Scanner leer = new Scanner(System.in);
      
    public void menu () {
        boolean exit = false;
        boolean valid = false;
        int optionMenu = 0;

        do {
            do {
                System.out.println("--- CALCULADORA GRÁFICA ---");
                System.out.println("---------------------------");
                System.out.println("Seleccione la figura.");
                System.out.println("1 - Cuadrado.");
                System.out.println("2 - Rectángulo.");
                System.out.println("3 - Triángulo.");
                System.out.println("4 - Círculo.");
                System.out.println("5 - Hexágono.");
                System.out.println("6 - Pentagono.");
                System.out.println("7 - Rombo.");
                System.out.println("8 - Salir.");
                optionMenu = leer.nextInt();
                leer.nextLine();
                
                valid = validateMenu(optionMenu);
            } while (!valid);
            
            exit = executeMenu(optionMenu);
        } while (!exit);
    }
        
    private boolean validateMenu (int option) {
        if (option > 0 && option < 9) {
            return true;
        } else {
            System.out.println("Ingrese una opcion válida.");
            System.out.println("");
            return false;
        }
    }
    
    private boolean executeMenu (int option) {
        switch (option) {
            case 1:    
                Figure f1 = new Figure(option);
                f1 = createSquare(option);
                showFigure(f1);
                return false;
            case 2:      
                Figure f2 = new Figure(option);
                f2 = createRectangle(option); 
                showFigure(f2);
                return false;
            case 3:          
                Figure f3 = new Figure(option);
                f3 = createTriangle(option); 
                showFigure(f3);
                return false;
            case 4:     
                Figure f4 = new Figure(option);
                f4 = createCircle(option);     
                showFigure(f4);
                return false;
            case 5:         
                Figure f5 = new Figure(option); 
                f5 = createHexagon(option);
                showFigure(f5);
                return false;
            case 6:    
                Figure f6 = new Figure(option); 
                f6 = createPentagon(option);
                showFigure(f6);                
                return false;
            case 7:        
                Figure f7 = new Figure(option); 
                f7 = createRhombus(option);
                showFigure(f7);      
                return false;
            case 8:
                return true;
            default:
                return false;
        }
    }  
    
    private Figure createSquare(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */      
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida del lado del cuadrado.");
        double side = leer.nextDouble();
        
        double area = Math.pow(side, 2);
        double perimeter = side * 4;
        
        return new Figure(name, type, area, perimeter);
    }
    
    private Figure createRectangle(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */        
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida de la base del rectángulo.");
        double base = leer.nextDouble();
        
        System.out.println("Ingrese la medida de la altura del rectángulo.");
        double heigth = leer.nextDouble();
        
        double area = base * heigth;
        double perimeter = (base + heigth) * 2;
        
        return new Figure(name, type, area, perimeter);
    }
    
    private Figure createTriangle(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */        
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida de la base del triangulo.");
        double base = leer.nextDouble();
        
        System.out.println("Ingrese la medida de la altura del triangulo.");
        double heigth = leer.nextDouble();
        
        double area = (base * heigth) / 2;
        double perimeter = base * 3;
        
        return new Figure(name, type, area, perimeter);
    }
    
    private Figure createCircle(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */        
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida del radio del círculo.");
        double radius = leer.nextDouble();
        
        double area = PI * Math.pow(radius, 2);
        double perimeter = 2 * PI * radius;
        
        return new Figure(name, type, area, perimeter);
    }
    
    private Figure createHexagon(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */        
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida del lado del hexágono.");
        double side = leer.nextDouble();
        
        System.out.println("Ingrese la medida de la apotema del hexágono.");
        double apothem = leer.nextDouble();
        
        double perimeter = side * 6;
        double area = (perimeter * apothem) / 2;        
        
        return new Figure(name, type, area, perimeter);
    }
    
    private Figure createPentagon(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */        
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida del lado del hexágono.");
        double side = leer.nextDouble();
        
        System.out.println("Ingrese la medida de la apotema del hexágono.");
        double apothem = leer.nextDouble();
        
        double perimeter = side * 5;
        double area = (perimeter * apothem) / 2;        
        
        return new Figure(name, type, area, perimeter);
    }
    
    private Figure createRhombus(int type) {
        /*
        * Recieves data from console and creates a Figure object.
        * return: Figure object. 
        */        
        System.out.println("Ingrese el nombre de la figura.");
        String name = leer.nextLine();
        
        System.out.println("Ingrese la medida del lado del rombo.");
        double side = leer.nextDouble();
        
        System.out.println("Ingrese la medida de la diagonal mayor del hexágono.");
        double mayorDiagonal = leer.nextDouble();        
        
        System.out.println("Ingrese la medida de la diagonal menor del hexágono.");
        double minorDiagonal = leer.nextDouble();
        
        double perimeter = side * 4;
        double area = (mayorDiagonal * minorDiagonal) / 2;        
        
        return new Figure(name, type, area, perimeter);
    }

    private void showFigure(Figure f) {
        DecimalFormat formato1 = new DecimalFormat("#.##");
        
        System.out.println("");
        System.out.println(f.getName().toUpperCase());
        System.out.println("Tipo: " + f.getType());
        System.out.println("Área: " + formato1.format(f.getArea()) + "cm.");
        System.out.println("Perímetro: " + formato1.format(f.getPerimeter()) + "cm.");
        System.out.println("");
    }
}
