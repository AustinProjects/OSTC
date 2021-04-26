package BankAccount;

public class BankAccount {
    double balance;
    String name;
    public BankAccount(double initial) {
        balance = balance + initial;
    }
    public void withdraw(double wAmount) {
        balance -= wAmount;
    }
    public void deposit(double dAmount) {
        balance += dAmount;
    }
}
