/*
 * 
 */
package Entity;

/**
 *
 * @author Angelica
 */
public class BankAccount {
    
    private int accountNumber;
    private int clientId;
    private double balance;

    public BankAccount() {
    }    
    
    public BankAccount(int accountNumber, int clientDni, double balance) {
        this.accountNumber = accountNumber;
        this.clientId = clientDni;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", clientId=" + clientId + ", balance=" + balance + '}';
    }
    
}
