import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Base class for a Bank Account
class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initial balance
    }
//    sout
    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Derived class for Savings Account (inheritance example)
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate for savings account

    public SavingsAccount(String accountHolderName, String accountNumber, double interestRate) {
        super(accountHolderName, accountNumber); // Call parent constructor
        this.interestRate = interestRate;
    }

    // Method to calculate and add interest
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest); // Add interest as a deposit
        System.out.println("Interest added: $" + interest);
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Savings Account
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(name, accountNumber, interestRate);

        boolean running = true;

        // Menu-driven program
        while (running) {
            System.out.println("\n----- Banking System Menu -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    savingsAccount.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current Balance: $" + savingsAccount.getBalance());
                    break;

                case 4:
                    savingsAccount.addInterest();
                    break;

                case 5:
                    savingsAccount.displayAccountDetails();
                    break;

                case 6:
                    System.out.println("Exiting the system. Thank you!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

