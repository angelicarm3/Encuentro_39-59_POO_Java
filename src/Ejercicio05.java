/*
 * 
 */


import Entity.BankAccount;
import Service.BankAccountService;
import java.util.Scanner;

/**
 *
 * @author Angelica
 */
public class Ejercicio05 {
        
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        BankAccountService bas1 = new BankAccountService();
        BankAccount ba1 = bas1.createBankAccount();
                
        System.out.println("Ingrese la cantidad a consignar.");
        bas1.deposit(leer.nextDouble(), ba1);
        
        System.out.println("Ingrese la cantidad a retirar.");
        bas1.withdraw(leer.nextDouble(), ba1);
        
        System.out.println("Ingrese la cantidad a retirar (Máximo el 20% de su saldo actual).");
        bas1.quickWithdraw(leer.nextDouble(), ba1);
        
        bas1.showBalance(ba1);
        
        bas1.showInfo(ba1);
    }
}
