package atmInterface;

import java.util.Scanner;

public class AtmInterface {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	Account myAccount = new Account("Akanksha", "1234", 10000.0);
	System.out.println("Welcome to the Atm interface");
	System.out.print("Please enter your 4-digit PIN: ");
    String inputPin = scanner.nextLine();
    
    if (!myAccount.validatePin(inputPin)) {
        System.out.println("Invalid PIN! Exiting...");
        return;
    }
	
	
	int choice;
    do {
        System.out.println("\n========= ATM Menu =========");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Mini Statement");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        switch (choice) {
        case 1:
            myAccount.checkBalance();
            break;
        case 2:
            System.out.print("Enter amount to deposit: ₹");
            double depositAmount = scanner.nextDouble();
            myAccount.deposit(depositAmount);
            myAccount.checkBalance();
            break;
        case 3:
            System.out.print("Enter amount to withdraw: ₹");
            double withdrawAmount = scanner.nextDouble();
            myAccount.withdraw(withdrawAmount);
            myAccount.checkBalance();
            break;
        case 4:
            myAccount.showMiniStatement();
            break;
        case 5:
            System.out.println("Thank you for using the ATM. Goodbye!");
            break;
        default:
            System.out.println("Invalid choice! Please select a valid option.");
    }

} while (choice != 5);

scanner.close();
}

}
