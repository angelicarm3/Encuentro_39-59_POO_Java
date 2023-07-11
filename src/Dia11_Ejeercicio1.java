/*
 * 
 */

import Entity.Movie;
import Service.MovieService;
import Service.RentService;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class Dia11_Ejeercicio1 {

    private static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        /*
        * Displays a menu and receives an option. 
        * Repeats until option is valid.
         */
        boolean exit = false;
        boolean valid = false;
        int optionMenu = 0;

        do {
            do {
                System.out.println("--- BLOCKBUSTER ---");
                System.out.println("-------------------");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Cargar una nueva película.");
                System.out.println("2. Cargar un nuevo alquiler.");
                System.out.println("3. Ver las películas disponibles.");
                System.out.println("4. Ver las películas alquiladas.");
                System.out.println("5. Buscar película por título.");
                System.out.println("6. Buscar película por género.");
                System.out.println("7. Buscar alquiler por fecha de inicio.");
                System.out.println("8. Salir.");
                optionMenu = leer.nextInt();
                leer.nextLine();
                valid = validateMenu(optionMenu);
            } while (!valid);

            exit = executeMenu(optionMenu);
        } while (!exit);
    }

    private static boolean validateMenu(int option) {
        /*
        * Validates if the option selected is a number between 1 and 8.
        * retun: true is valid, flase if not.
         */
        if (option > 0 || option < 9) {
            return true;
        } else {
            System.out.println("Ingrese una opcion válida.");
            return false;
        }
    }

    private static boolean executeMenu(int option) {
        /*
        * Executer option and calls corresponding method.
         */
        MovieService ms1 = new MovieService();
        RentService rs1 = new RentService();

        switch (option) {
            case 1:
                Movie m = ms1.createMovie();
                ms1.listMovies(ms1);
                System.out.println(ms1);
                return false;
//            case 2:
//                Rent[] rentList = new Rent[6];
//                
//                Rent r = rs1.createRent();
//                rs1.addRent(menu, r);
//                System.out.println("");
//                rs1.listRents(menu);  
//                return false;
//            case 3:
//                ms1.listMovies();
//                System.out.println("");
//                return false;
//            case 4:
//                rs1.listRents();
//                System.out.println("");
//                return false;
//            case 5:
//                ms1.findMovieTitle();    
//                System.out.println("");            
//                return false;
//            case 6:
//                ms1.findMovieGenre();    
//                System.out.println("");            
//                return false;
//            case 7:
//                rs1.findRentDate();    
//                System.out.println("");            
//                return false;
            case 8:
                return true;
            default:
                return false;
        }

    }
}
//        Movie m1 = ms1.createMovie("Avatar 2", "Sci-Fi", 2023, 180);
//        Movie m2 = ms1.createMovie("Toy Story 1", "Animada", 2000, 120);
//        Movie m3 = ms1.createMovie("Flash", "Héroes", 2021, 144);
//        Movie m4 = ms1.createMovie("Indiana Jones", "Acción", 2010, 154);
//        Movie m5 = ms1.createMovie("El colibrí", "Drama", 2015, 126);
//        Rent r1 = rs1.createRent("Avatar 2", LocalDate.of(2023, 6, 3), LocalDate.of(2023, 6, 8));
//        Rent r2 = rs1.createRent("Indiana Jones", LocalDate.of(2023, 7, 13), LocalDate.of(2023, 7, 15));
//        Rent r3 = rs1.createRent("El colibrí", LocalDate.of(2023, 2, 10), LocalDate.of(2023, 2, 20));
//        
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m5);
//        System.out.println(r1);
//        System.out.println(r2);
//        System.out.println(r3);