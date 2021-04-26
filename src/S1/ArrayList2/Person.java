package S1.ArrayList2;

public class Person {
    final String name;
    String address;

    public Person(String n, String a) {
        this.address = a;
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name= " + name + ", address= " +address + "]";
    }
}
