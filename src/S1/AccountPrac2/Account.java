package S1.AccountPrac2;

public class Account {

    final String id;
    final String name;
    int balance = 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public void credit(int amount) {
        balance += amount;
    }
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }
    public int transferTo(Account account, int amount) {
        if (amount <= balance) {
            account.credit(amount);
            this.debit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public String toString() {
        return "Account[id=" +id+ ",name=" +name+ ",balance=" +balance + "]";
    }
}
