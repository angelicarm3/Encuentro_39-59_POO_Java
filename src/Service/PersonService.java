/*
 * 
 */
package Service;

import Entity.Person;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * 
 * @author Angelica
 */
public class PersonService {

    private Scanner leer = new Scanner(System.in);

    public Person createPerson(String name, LocalDate dateOfBirth, String gender, double weigth, double heigth) {
        /*
        * Receives info from parameters and creates a Person object.
        * return: Person object. 
        */        
        int age = calculateAge(dateOfBirth);
        
        return new Person(name, dateOfBirth, age, gender, weigth, heigth);
    }
    
    public Person createPerson() {
        /*
        * Recieves data from console and creates a Person object.
        * return: Person object. 
        */
        boolean valid = false;
        int year = 0;
        int month = 0;
        int day = 0;
        String gender = "";

        System.out.println("Ingrese su nombre.");
        String name = (leer.nextLine());

        do {
            System.out.println("Ingrese su fecha de nacimiento. (AAAA/MM/DD)");
            year = leer.nextInt();
            month = leer.nextInt();
            day = leer.nextInt();
            leer.nextLine();

            valid = validateDate(year, month, day);
        } while (!valid);
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        valid = false;

        do {
            System.out.println("Ingrese su género. (F/M/O)");
            gender = (leer.nextLine().toUpperCase());
            
            valid = validateGender(gender);
        } while (!valid);

        int age = calculateAge(dateOfBirth);

        System.out.println("Ingrese su peso en kg.");
        double weigth = leer.nextDouble();

        System.out.println("Ingrese su talla en mt.");
        double heigth = leer.nextDouble();

        return new Person(name, dateOfBirth, age, gender, weigth, heigth);
    }
    
    public Person createPerson2() {
        /*
        * Recieves data from console and creates a Person object.
        * return: Person object. 
        */
        boolean valid = false;
        int year = 0;
        int month = 0;
        int day = 0;

        System.out.println("Ingrese su nombre.");
        String name = (leer.nextLine());

        do {
            System.out.println("Ingrese su fecha de nacimiento. (AAAA/MM/DD)");
            year = leer.nextInt();
            month = leer.nextInt();
            day = leer.nextInt();
            leer.nextLine();

            valid = validateDate(year, month, day);
        } while (!valid);
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        valid = false;

        int age = calculateAge(dateOfBirth);

        return new Person(name, dateOfBirth, age);
    }

    private boolean validateDate(int year, int month, int day) {
        /*
        * Validates date.
        */
        boolean leapYear = validateYear(year);

        if (year > 1912 && year < 2024) {
            if ((day > 0 && day < 32) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                return true;
            } else if ((day > 0 && day < 31) && (month == 4 || month == 6 || month == 9 || month == 11)) {
                return true;
            } else if (day > 0 && day < 30 && leapYear && month == 2) {
                return true;
            } else if (day > 0 && day < 29 && !leapYear && month == 2) {
                return true;
            } else {
                System.out.println("Ingrese una fecha válida.");
                return false;
            }
        } else {
            System.out.println("Ingrese una fecha válida.");
            return false;
        }
    }

    private boolean validateYear(int year) {
        /*
        * Validates if year is a leap year.
        * return: true for a leap year, false if otherwise.
        */
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean validateGender(String gender) {
        /*
        * Validates gender. F, M or O.
        */
        if (gender.equals("F") || gender.equals("M") || gender.equals("O") ) {
            return true;
        } else {
            System.out.println("Ingrese una opción válida");
            return false;
        }
    }
    
    public int calculateBMI(Person p) {       
        /*
        * Calculates BMI.
        *return: -1 for low weigth, 0 for healthy weigth and 1 for overweigth.
        */
        double bmi = p.getWeigth() / Math.pow(p.getHeigth(), 2);
        
        if (bmi < 20) {
            /* Low weigth */
            return -1;
        } else if (bmi > 19 && bmi < 26) {
            /* Healthy weigth */
            return 0;
        } else {
            /* Overweigth */
            return 1;
        }
    }
    
    public boolean ofAge(Person p) {
        /*
        * Validates if Person is over 18 yo.
        */
        if (p.getAge() > 17) {
            /* Of age */
            return true;
        } else {
            /* Under Age */
            return false;
        }
    }
    
    private int calculateAge(LocalDate dateOfBirth) {
        /*
        * Calculates age based on DoB and today's date.
        * return: age.
        */
        LocalDate today = LocalDate.now();
        Period period = Period.between(dateOfBirth, today);
        
        return period.getYears();
    }
    
    public boolean youngerThan(Person p) {
        /*
        * Recieves a Person object, asks for a reference age and calculates if Person is younger.
        */        
        System.out.println("Ingrese la edad de referencia.");
        int otherAge = (leer.nextInt());

        if (otherAge < p.getAge()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void showPerson(Person p) {
        /*
        * Recieves a Person object and shows its information.
        */
        System.out.println("PERSONA CREADA");
        System.out.println("--------------");
        System.out.println("Nombre: " + p.getName());
        System.out.println("Fecha de nacimiento: " + p.getDateOfBirth());
        System.out.println("Edad: " + p.getAge() + " años.");
    }
}
