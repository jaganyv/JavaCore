//import java.util.Scanner;
//class Banking{
//    private String accountNumber;
//    private String accountName;
//    private double balance;
//    public void Banking(String accountNumber,String accountName){
//        this.accountName = accountName;
//        this.accountNumber = accountNumber;
//        this.balance = 0.0;
//    }
//    public double getBalance(){
//        return balance;
//    }
//    public void deposit(double amount){
//        if(amount>0){
//            balance+=amount;
//            System.out.println("Deposited $:" + amount);
//        }else{
//            System.out.println("Invalid Deposit Amount");
//        }
//    }
//    public void withdraw(double amount){
//        if(amount>0 && amount<=balance){
//            balance-=amount;
//            System.out.println("Amount Withdrawn $:" + amount);
//        }else if(amount>balance){
//            System.out.println("Insufficient Balance");
//        }else{
//            System.out.println("Invalid Withdrawal Amount");
//        }
//    }
//    public void displayAccountDetails(){
//        System.out.println("Account Number:" + accountNumber);
//        System.out.println("Account Name:"+ accountName);
//        System.out.println("Balance:" + balance);
//    }
//class SavingsAccount extends Banking{
//        private double interestRate;
//
//        public SavingsAccount(String accountNumber,String accountName,double interestRate){
//            super(accountNumber,accountName);
//            this.interestRate = interestRate;
//        }
//        public void addInterest(){
//            double interest = getBalance()*(interestRate/100);
//            deposit(interest);
//            System.out.println("Interest Added$:" + interest);
//        }
//}
//
//
//}
//public class Bank {
//    public static void main(String args[]){
//      Scanner scan = new Scanner(System.in);
//      System.out.println("Enter Account Holder Name");
//      String name = scan.nextline();
//      System.out.println("Enter Account Number");
//      String accountNumber = scan.nextLine();
//      System.out.println("Enter Interest Rate:");
//      double interestRate = scan.nextDouble();
//
//        SavingsAccount savingAccount = new SavingsAccount(name,accountNumber,interestRate);
//        boolean run = true;
//
//        while (running) {
//            System.out.println("\n----- Banking System Menu -----");
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Check Balance");
//            System.out.println("4. Add Interest");
//            System.out.println("5. Display Account Details");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = scan.nextInt();
//        }
//        switch (choice) {
//            case 1:
//                System.out.print("Enter amount to deposit: ");
//                double depositAmount = scan.nextDouble();
//                savingsAccount.deposit(depositAmount);
//                break;
//
//            case 2:
//                System.out.print("Enter amount to withdraw: ");
//                double withdrawAmount = scan.nextDouble();
//                savingsAccount.withdraw(withdrawAmount);
//                break;
//
//            case 3:
//                System.out.println("Current Balance: $" + savingsAccount.getBalance());
//                break;
//
//            case 4:
//                savingsAccount.addInterest();
//                break;
//
//            case 5:
//                savingsAccount.displayAccountDetails();
//                break;
//
//            case 6:
//                System.out.println("Exiting the system. Thank you!");
//                running = false;
//                break;
//
//            default:
//                System.out.println("Invalid choice. Please try again.");
//        }
//    }
//
//        scan.close();
//}

