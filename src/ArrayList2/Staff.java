package ArrayList2;

public class Staff extends Person {
    String school;
    double pay;
    String name;
    String address;
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
        this.name = name;
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff[Person[name= " + name + ", address= " + address + "], school=" + school + ", pay= " + pay+"]";
    }
}
