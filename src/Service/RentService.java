/*
 * 
 */
package Service;

import Entity.Rent;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class RentService {
    
    private Scanner leer = new Scanner(System.in);
    
    ArrayList<Rent> rentList;
    
    public RentService() {
        rentList = new ArrayList<Rent>();
    }

    public RentService(ArrayList<Rent> rentList) {
        this.rentList = rentList;
    }
    
    public Rent createRent(String movie, LocalDate startDate, LocalDate endDate) {
        double price = calculatePrice(startDate, endDate);
        
        return new Rent(movie, startDate, endDate, price);
    }
    
    public Rent createRent() {
        /*
        * Recieves data and creates a RentService object.
        * return: RentService object. 
        */          
        Rent r = new Rent();
        System.out.println("Ingrese el nombre de la película.");
        r.setMovie(leer.nextLine());
        
        System.out.println("Ingrese la fecha de inicio. (AAAA/MM/DD)");
        int year = leer.nextInt();
        int month = leer.nextInt();
        int day = leer.nextInt();
        
        LocalDate startDate = LocalDate.of(year, month, day);
        r.setStartDate(startDate);
        
        System.out.println("Ingrese la fecha de finalización. (AAAA/MM/DD)");
        year = leer.nextInt();
        month = leer.nextInt();
        day = leer.nextInt();
        leer.nextLine();
        
        LocalDate endDate = LocalDate.of(year, month, day);
        r.setEndDate(endDate);
        
        double price = calculatePrice(startDate, endDate);
                                       
        return r;
    }
    
    public double calculatePrice(LocalDate startDate, LocalDate endDate) {
        /*
        * Recieves start and end date and calculates the rent price.
        * $10/3 days - 10%+ per extra day
        * return: price
        */
        double price = 10;
        
        Period period = Period.between(startDate, endDate);
        
        int days = period.getDays();
        
        if (days > 3) {
            int extraDays = days - 3;
            double interest = (price * 0.10) * extraDays;
            price += interest;
        }
                
        return price;
    }
    
//    public void addRent(Menu menu, Rent m) {
//        Rent[] rentList = new Rent[4];
//        
//        for (int i = 0; i < 6; i++) {
//            if (rentList[i] == null) {
//                rentList[i] = m;
//                break;
//            } else {
//                continue;
//            }         
//        }
//        
//        menu.setRentList(rentList);
//    }
//          
//    public void listRents(Rent[] list) {
//            for (int i = 0; i < list.length; i++) {
//                System.out.println(list[i]);
//            }
//    }
}
