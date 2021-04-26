package S1.EmployeeClass;

public class Tester {
    public static void main(String[] args) {
        Employee emp1 = new Employee(3000,"Austin", "Garrett", 100000);
        System.out.println(emp1.getID());
        System.out.println(emp1.getFirstName());
        System.out.println(emp1.getLastName());
        System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
        System.out.println(emp1.setSalary(2399));
        System.out.println(emp1.getAnnualSalary());
        System.out.println(emp1.raiseSalary(41));
        System.out.println(emp1.toString());




    }


}
