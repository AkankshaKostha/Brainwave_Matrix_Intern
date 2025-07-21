package atmInterface;

import java.util.*;

public class Account {
	
	private String accountHolderName;
	private String pin;
	private double balance;
	private List<String> miniStatement;
	
		
	public Account(String accountHolderName, String pin, double balance) {
		super();
		this.accountHolderName = accountHolderName;
		this.pin = pin;
		this.balance = balance;
		this.miniStatement = new ArrayList<>();
	}
	
    public boolean validatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            miniStatement.add("Deposited: ₹" + amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Enter a valid amount to deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            miniStatement.add("Withdrawn: ₹" + amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void showMiniStatement() {
        System.out.println("\n---- Mini Statement ----");
        if (miniStatement.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : miniStatement) {
                System.out.println(transaction);
            }
        }
    }
}
	
	
	
	
	
	


