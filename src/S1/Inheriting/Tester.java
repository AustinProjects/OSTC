package S1.Inheriting;

public class Tester {
    public static void main(String[] args) {
    Employee employee = new Employee();
    Secretary secretary = new Secretary();
    Lawyer lawyer = new Lawyer();
    LegalSecretary joshua = new LegalSecretary();

    // LegalSecretary
        System.out.println(joshua.getSalary());
        joshua.takeDictation("The big man");

        // lawyer
        System.out.println(lawyer.getVacationDays());
        lawyer.getSalary();
        lawyer.sue();

        // Secretary
        secretary.takeDictation("Your boss fired me!");
    }


}
