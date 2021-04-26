package S1.AccountPrac2;

public class Tester {
    public static void main(String[] args) {
        Account acc1 = new Account("austin_bank", "Austin Garrett", 100000);
        Account acc2 = new Account("new_account", "Dwayne Hook");

        System.out.println(acc1.getId());
        System.out.println(acc1.getName());
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getId());
        System.out.println(acc2.getName());
        System.out.println(acc1.transferTo(acc2, 3000));
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
