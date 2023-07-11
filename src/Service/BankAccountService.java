/*
 * 
 */
package Service;

import Entity.BankAccount;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class BankAccountService {    
    private Scanner leer = new Scanner(System.in);
   
    public BankAccount createBankAccount () {       
        System.out.println("Ingrese el número de cuenta.");
        int accountNumber = (leer.nextInt());
        
        System.out.println("Ingrese su número de identificación.");
        int clientId = (leer.nextInt());
        
        System.out.println("Ingrese su saldo actual.");
        double balance = (leer.nextDouble());
        
        return new BankAccount(accountNumber, clientId, balance); 
    }   
   
    public void deposit(double amount, BankAccount ba) {        
        double balance = ba.getBalance() + amount;
        ba.setBalance(balance);      
    }
    
    public void withdraw(double amount, BankAccount ba) {        
        if (amount > ba.getBalance()) {
            ba.setBalance(0);
        } else {
            double balance = ba.getBalance() - amount;
            ba.setBalance(balance);
        }       
    }
    
    public void quickWithdraw(double amount, BankAccount ba) {        
        if (amount > (ba.getBalance() * 0.20)) {
            System.out.println("La cantidad a retirar supera el 20% de su saldo actual.");
        } else {
            double balance = ba.getBalance() - amount;
            ba.setBalance(balance);
        }     
    }
    
    public void showBalance(BankAccount ba) {        
        System.out.println("Saldo actual: " + ba.getBalance());       
    }
    
    public void showInfo(BankAccount ba) {        
        System.out.println("RESUMEN DE SU CUENTA");  
        System.out.println("Número de cuenta: " + ba.getAccountNumber()); 
        System.out.println("Identificación cliente: " + ba.getClientId()); 
        System.out.println("Saldo actual: " + ba.getBalance());   
    }

    
}
