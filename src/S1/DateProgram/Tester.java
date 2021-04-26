package S1.DateProgram;

public class Tester {
    public static void main(String[] args) {
        Date date = new Date(11, 11, 2024);

        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.setDay(12));
        System.out.println(date.setMonth(10));
        System.out.println(date.setYear(1982));
        System.out.println(date.setDate(12, 10, 2011));
        System.out.println(date.toString());

    }
}
