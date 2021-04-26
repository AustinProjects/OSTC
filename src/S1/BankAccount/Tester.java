package S1.BankAccount;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String accountName = scanner.nextLine();
        System.out.print("Enter your initial balance: ");
        double initial1 = scanner.nextInt();
        BankAccount myAccount = new BankAccount(initial1);
        System.out.println("Depositing $505.22");
        myAccount.deposit(505.22);
        System.out.println("Balance: " + myAccount.balance);
        System.out.println("Withdrawing $100");
        myAccount.withdraw(100);
        System.out.println("The " + accountName + " account balance is, $" + myAccount.balance);
    }
}
