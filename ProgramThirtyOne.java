package javaexamples;

import java.util.Collections;

class InsufficientBalanceException extends Exception 
{
	public InsufficientBalanceException(String message) 
	{
		super(message);
	}
}

//BankAccount class representing a bank account
class BankAccount {
 
	private double balance;

	public BankAccount(double initialBalance) 
	{
     this.balance = initialBalance;
	}

 // Method to deposit money into the account
	public void deposit(double amount) 
	{
     balance += amount;
     System.out.println("Deposited: " + amount);
	}

 // Method to withdraw money from the account
 public void withdraw(double amount) throws InsufficientBalanceException 
 	{
     if (balance - amount < 1000) 
     {
         throw new InsufficientBalanceException("Insufficient balance. Minimum balance of 1000 required.");
     }
     balance -= amount;
     System.out.println("Withdrawn: " + amount);
 	}

 // Method to check the account balance
 public double getBalance() 
 	{
     return balance;
 	}
}


public class ProgramThirtyOne {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500); // Withdraw an amount that doesn't drop the balance below 1000
            account.deposit(500);   // Deposit an amount
            account.withdraw(1000); // Withdraw an amount that drops the balance below 1000 (should throw an exception)
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Current Balance: " + account.getBalance());
	}

}

//https://www.javatpoint.com/collections-in-java
